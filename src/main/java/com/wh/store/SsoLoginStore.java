package com.wh.store;


import com.wh.utils.CookieUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * local ssologin com.wh.store
 */
public class SsoLoginStore {
    /**
     * 删除 token,Cookie
     *
     * @param request
     * @param response
     */
    public static void removeTokenByCookie(HttpServletRequest request,
                                           HttpServletResponse response, String key) {
        CookieUtil.remove(request, response, key);
    }

}
