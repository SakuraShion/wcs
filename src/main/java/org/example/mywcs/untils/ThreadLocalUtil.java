package org.example.mywcs.untils;

import org.example.mywcs.domain.FeginUser;

/**
 * @Author：hb
 * @Package：org.example.mywcs.untils
 * @Project：my-wcs
 * @Date：26/11/2024 3:03 pm
 */
public class ThreadLocalUtil {
    private static final ThreadLocal<String> USER_ID_THREAD_LOCAL = new ThreadLocal<>();
    public static void setUserId(String userId) {
        USER_ID_THREAD_LOCAL.set(userId);
    }


    public static String getUserId() {
        return USER_ID_THREAD_LOCAL.get();
    }
}
