package com.phimhd

import android.util.Base64

/* loaded from: classes4.dex */
object AESHelper {
    var AES = "AES"
    var APPEND = "Salted__"
    var CHARSET_TYPE = "UTF-8"
    var HASH_CIPHER = "AES/CBC/PKCS7Padding"
    var IV_SIZE = 128
    var KDF_DIGEST = "MD5"
    var KEY_SIZE = 256
    @Throws(
        UnsupportedEncodingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        InvalidAlgorithmParameterException::class,
        InvalidKeyException::class,
        BadPaddingException::class,
        IllegalBlockSizeException::class
    )
    fun encrypt(str: String, str2: String): String {
        val generateSalt = generateSalt(8)
        val bArr = ByteArray(KEY_SIZE / 8)
        val bArr2 = ByteArray(IV_SIZE / 8)
        EvpKDF(str.getBytes(CHARSET_TYPE), KEY_SIZE, IV_SIZE, generateSalt, bArr, bArr2)
        val secretKeySpec = SecretKeySpec(bArr, AES)
        val cipher: Cipher = Cipher.getInstance(HASH_CIPHER)
        cipher.init(1, secretKeySpec, IvParameterSpec(bArr2))
        val doFinal: ByteArray = cipher.doFinal(str2.getBytes(CHARSET_TYPE))
        val bytes: ByteArray = APPEND.getBytes(CHARSET_TYPE)
        val bArr3 = ByteArray(bytes.size + generateSalt.size + doFinal.size)
        System.arraycopy(bytes, 0, bArr3, 0, bytes.size)
        System.arraycopy(generateSalt, 0, bArr3, bytes.size, generateSalt.size)
        System.arraycopy(doFinal, 0, bArr3, bytes.size + generateSalt.size, doFinal.size)
        return String(Base64.encode(bArr3, 0))
    }

    @Throws(
        UnsupportedEncodingException::class,
        NoSuchAlgorithmException::class,
        NoSuchPaddingException::class,
        InvalidAlgorithmParameterException::class,
        InvalidKeyException::class,
        BadPaddingException::class,
        IllegalBlockSizeException::class
    )
    fun decrypt(str: String, str2: String): String {
        val decode: ByteArray = Base64.decode(str2.getBytes(CHARSET_TYPE), 0)
        val copyOfRange: ByteArray = Arrays.copyOfRange(decode, 8, 16)
        val copyOfRange2: ByteArray = Arrays.copyOfRange(decode, 16, decode.size)
        val bArr = ByteArray(KEY_SIZE / 8)
        val bArr2 = ByteArray(IV_SIZE / 8)
        EvpKDF(str.getBytes(CHARSET_TYPE), KEY_SIZE, IV_SIZE, copyOfRange, bArr, bArr2)
        val cipher: Cipher = Cipher.getInstance(HASH_CIPHER)
        cipher.init(2, SecretKeySpec(bArr, AES), IvParameterSpec(bArr2))
        return String(cipher.doFinal(copyOfRange2))
    }

    @Throws(NoSuchAlgorithmException::class)
    private fun EvpKDF(
        bArr: ByteArray,
        i: Int,
        i2: Int,
        bArr2: ByteArray,
        bArr3: ByteArray,
        bArr4: ByteArray
    ): ByteArray {
        return EvpKDF(bArr, i, i2, bArr2, 1, KDF_DIGEST, bArr3, bArr4)
    }

    @Throws(NoSuchAlgorithmException::class)
    private fun EvpKDF(
        bArr: ByteArray,
        i: Int,
        i2: Int,
        bArr2: ByteArray,
        i3: Int,
        str: String,
        bArr3: ByteArray,
        bArr4: ByteArray
    ): ByteArray {
        val i4 = i / 32
        val i5 = i2 / 32
        val i6 = i4 + i5
        val bArr5 = ByteArray(i6 * 4)
        val messageDigest: MessageDigest = MessageDigest.getInstance(str)
        var bArr6: ByteArray? = null
        var i7 = 0
        while (i7 < i6) {
            if (bArr6 != null) {
                messageDigest.update(bArr6)
            }
            messageDigest.update(bArr)
            bArr6 = messageDigest.digest(bArr2)
            messageDigest.reset()
            for (i8 in 1 until i3) {
                bArr6 = messageDigest.digest(bArr6)
                messageDigest.reset()
            }
            System.arraycopy(bArr6, 0, bArr5, i7 * 4, Math.min(bArr6!!.size, (i6 - i7) * 4))
            i7 += bArr6.size / 4
        }
        val i9 = i4 * 4
        System.arraycopy(bArr5, 0, bArr3, 0, i9)
        System.arraycopy(bArr5, i9, bArr4, 0, i5 * 4)
        return bArr5
    }

    private fun generateSalt(i: Int): ByteArray {
        val bArr = ByteArray(i)
        SecureRandom().nextBytes(bArr)
        return bArr
    }
}