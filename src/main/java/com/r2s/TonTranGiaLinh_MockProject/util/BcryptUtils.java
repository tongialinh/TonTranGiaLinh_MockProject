package com.r2s.TonTranGiaLinh_MockProject.util;

import org.mindrot.jbcrypt.BCrypt;

public class BcryptUtils {
    public static String encode(String rawPassword){
        return BCrypt.hashpw(rawPassword,BCrypt.gensalt());
    }

    public static boolean check(String rawPassword, String hashPw){
        return BCrypt.checkpw(rawPassword, hashPw);
    }
}
