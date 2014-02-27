/**
 * $RCSfile$
 * $Revision: 11291 $
 * $Date: 2009-09-30 18:17:14 +0800 (周三, 30 九月 2009) $
 *
 * Copyright (C) 2004-2008 Jive Software. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.util;

import javax.servlet.*;
import java.io.IOException;


/**
 * Sets the character encoding to UTF-8.
 *
 * @author Matt Tucker
 */
public class SetCharacterEncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {
        
    }

    /**
     * Sets the character encoding to be used for any content passing out of this filter.
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException
    {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=" + "UTF-8");
        chain.doFilter(request, response);
    }
}
