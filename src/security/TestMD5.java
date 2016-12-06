package security;

import java.security.MessageDigest;

/**
 *
 * @author zhengchao
 */
public class TestMD5 {
    /**
    * 加签
    *
    * @param plain   原串
    * @param charset 字符集编码
    * @return
    */
   public static String sign(String plain, String charset) {
        StringBuffer md5Str = new StringBuffer(32);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charset == null || "".equals(charset)) {
                    charset = "UTF-8";
            }
            byte[] array = md.digest(plain.getBytes(charset));
            for (int i = 0; i < array.length; i++) {
                    md5Str.append(Integer.toHexString((array[i] & 0xFF) | 0x100).toUpperCase().substring(1, 3));
            }
        } catch (Exception ex) {
                ex.printStackTrace();
        }
        return md5Str.toString();
   }

   /**
    * 验签
    *
    * @param plain   原串
    * @param signed  签名串
    * @param charset 字符集编码
    * @return
    */
   public static boolean verifySign(String plain, String signed, String charset) {
        String plainSigned = sign(plain, charset);
        return plainSigned.equals(signed);
   }
   
   public static void main(String[] args){
       String password = "123456"; //我的密码，需要加密的对象
       
       //使用MD5加签，
       String signMessage = TestMD5.sign(password,"UTF-8");
       System.out.println("signMessage:"+signMessage);
       
       //验签1
       System.out.println("是否一致："+signMessage.equals(TestMD5.sign(password,"UTF-8")));
       
       //验签2
       String passwordOther = "654321";
       System.out.println("是否一致："+signMessage.equals(TestMD5.sign(passwordOther,"UTF-8")));
   }
}
