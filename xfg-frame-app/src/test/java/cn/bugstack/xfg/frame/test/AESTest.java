package cn.bugstack.xfg.frame.test;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description
 * @create 2023-07-18 22:08
 */
public class AESTest {

    /**
     * 密钥，必须是16位
     */
    private static final String KEY = "1143456789abudef";
    /**
     * 偏移量，必须是16位
     */
    private static final String IV = "abcdef9806543210";

    public static void main(String[] args) throws Exception {
        System.out.println(encrypt("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"));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
        System.out.println(encrypt(""));
    }

    public static String encrypt(String content) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] raw = KEY.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(content.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /**
     * AES解密
     *
     * @param content 密文
     * @return 明文
     * @throws Exception 异常
     */
    public String decrypt(String content) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] raw = KEY.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = Base64.getDecoder().decode(content);
        byte[] original = cipher.doFinal(encrypted);
        return new String(original);
    }

}
