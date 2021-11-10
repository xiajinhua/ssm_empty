package com.ssm.util;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MD5Util {

    public static int m_hashIterations = 1024;
    public static String m_salt = "gxch";

    public static String Md5EnCode(String source, String salt) {
        return new Md5Hash(source, salt, m_hashIterations).toString();
    }

    public static String Md5EnCode(String source) {
        return new Md5Hash(source, m_salt, m_hashIterations).toString();
    }


    public static void main(String[] args) {
        System.out.println(Md5EnCode("123456"));
    }
}
