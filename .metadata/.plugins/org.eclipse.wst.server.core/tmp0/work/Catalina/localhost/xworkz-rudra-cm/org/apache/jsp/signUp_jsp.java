/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2023-03-28 18:53:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/Java%20eclipse/Project-cm/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/xworkz-rudra-cm/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1675673073704L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>X-Workz</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg-navbar-Light bg-dark\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("\t\t\t\tsrc=\" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png\"\r\n");
      out.write("\t\t\t\talt=\"\" width=\"80\" height=\"48\" class=\"d-inline-block align text-top\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\">Home</a> <a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png\"\r\n");
      out.write("\t\t\t\t\talt=\"\" width=\"80\" height=\"48\" class=\"d-inline-block align text-top\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<h1 style=\"color: green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\t<h5 style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${messag}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</h5>\r\n");
      out.write("\t<form action=\"save\" method=\"post\">\r\n");
      out.write("\t\tUser ID <input type=\"text\" name=\"userId\" id=\"userName\"\r\n");
      out.write("\t\t\tonchange=\"ValideName()\"> <span id=\"nameError\"\r\n");
      out.write("\t\t\tstyle=\"color: red\"></span><br> \r\n");
      out.write("\t\tEmail<input type=\"email\" name=\"email\" id=\"emailId\" onchange=\"valideEmail()\"> <span\r\n");
      out.write("\t\t\tid=\"emailError\" style=\"color: red\"></span><br> \r\n");
      out.write("\t\tMobile Number<input type=\"number\" name=\"mobile\" id=\"userMobile\" onchange=\"ValideMobile()\">\r\n");
      out.write("\t\t    <span id=\"mobileError\" style=\"color: red\"></span> <br> \r\n");
      out.write("\t\tPassword<input type=\"password\" name=\"password\" id=\"userPassword\"\r\n");
      out.write("\t\t\tonchange=\"ValidePassword()\"> <span id=\"passwordError\"\r\n");
      out.write("\t\t\tstyle=\"color: red\"></span> <input type=\"checkbox\"\r\n");
      out.write("\t\t\tonclick=\"myFunction()\">Show Password <br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tConfirmPassword<input type=\"password\" name=\"confirmPassword\"\r\n");
      out.write("\t\t\tid=\"userConfirmPassword\" onchange=\"ValidePassword()\">\r\n");
      out.write("\t\t\t<span\tid=\"passwordCompare\" style=\"color: red\"></span> <br>  \r\n");
      out.write("\t\tAgreement <input type=\"checkbox\" name=\"agreement\" id=\"agreementConfirm\"\r\n");
      out.write("\t\t\tonclick=\"onconfirm()\"> <br>\r\n");
      out.write("\t\t    <button type=\"submit\" class=\"btn btn-success\" id=\"submitId\"\r\n");
      out.write("\t\t\tdisabled=\"true\">SignUp</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<h4 style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction myFunction() {\r\n");
      out.write("\t\t\tvar x = document.getElementById(\"userPassword\");\r\n");
      out.write("\t\t\tif (x.type === \"password\") {\r\n");
      out.write("\t\t\t\tx.type = \"text\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tx.type = \"password\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write(" \t\tfunction onconfirm() {\r\n");
      out.write(" \t\t\tvar agree = document.getElementById('agreementConfirm');\r\n");
      out.write("\t\t\tconsole.log(agree.checked);\r\n");
      out.write("\t\t\tif (agree.checked) {\r\n");
      out.write("\t\t\t\tdocument.getElementById('submitId').disabled = false;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tdocument.getElementById('submitId').disabled = 'disabled';\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction ValideName() {\r\n");
      out.write("\t\t\tvar user = document.getElementById('userName');\r\n");
      out.write("\t\t\tvar uservalue = user.value;\r\n");
      out.write("\t\t\tconsole.log(uservalue);\r\n");
      out.write("\t\t\tif (uservalue != null && uservalue != \"\" && uservalue.length > 3\r\n");
      out.write("\t\t\t\t\t&& uservalue.length < 30) {\r\n");
      out.write("\t\t\t\tconsole.log('valide name');\r\n");
      out.write("\t\t\t\tdocument.getElementById('nameError').innerHTML = '';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tconsole.log('invalide name');\r\n");
      out.write("\t\t\t\tdocument.getElementById('nameError').innerHTML = 'Plese enter valide name min 4 and max 30 character';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction valideEmail() {\r\n");
      out.write("\t\t\tvar userEmail = document.getElementById('emailId');\r\n");
      out.write("\t\t\tvar userEmailvalue = userEmail.value;\r\n");
      out.write("\t\t\tconsole.log(userEmailvalue);\r\n");
      out.write("\t\t\tif (userEmailvalue != null && userEmailvalue != \"\"\r\n");
      out.write("\t\t\t\t\t&& userEmailvalue.length > 4 && userEmailvalue.length < 40) {\r\n");
      out.write("\t\t\t\tconsole.log('valide email');\r\n");
      out.write("\t\t\t\tdocument.getElementById('emailError').innerHTML = '';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tconsole.log('invalide email');\r\n");
      out.write("\t\t\t\tdocument.getElementById('emailError').innerHTML = 'Plese enter valide email';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction ValideMobile() {\r\n");
      out.write("\t\t\tvar userMobile = document.getElementById('userMobile');\r\n");
      out.write("\t\t\tvar userMobilevalue = userMobile.value;\r\n");
      out.write("\t\t\tconsole.log(userMobilevalue);\r\n");
      out.write("\t\t\tif (userMobilevalue != null && userMobilevalue != \"\"\r\n");
      out.write("\t\t\t\t\t&& userMobilevalue.length == 10) {\r\n");
      out.write("\t\t\t\tconsole.log('valide mobile');\r\n");
      out.write("\t\t\t\tdocument.getElementById('mobileError').innerHTML = '';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tconsole.log('invalide mobile');\r\n");
      out.write("\t\t\t\tdocument.getElementById('mobileError').innerHTML = 'Plese enter valide Mobile Number';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction ValidePassword() {\r\n");
      out.write("\t\t\tvar userPassword = document.getElementById('userPassword');\r\n");
      out.write("\t\t\tvar userConfirmPassword = document.getElementById('userConfirmPassword');\r\n");
      out.write("\t\t\tvar userPasswordvalue = userPassword.value;\r\n");
      out.write("\t\t\tvar userConfirmPasswordvalue = userConfirmPassword.value;\r\n");
      out.write("\t\t\tconsole.log(userPasswordvalue);\r\n");
      out.write("\t\t\tif (userPasswordvalue != null && userPasswordvalue != \"\"\r\n");
      out.write("\t\t\t\t\t&& userPasswordvalue.length > 4\r\n");
      out.write("\t\t\t\t\t&& userPasswordvalue.length < 12) {\r\n");
      out.write("\t\t\t\tif(userPasswordvalue==userConfirmPasswordvalue){\r\n");
      out.write("\t\t\t\t\tconsole.log('valide both password are same');\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('passwordCompare').innerHTML = '';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tconsole.log('valide both password are not same');\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('passwordCompare').innerHTML = 'Password and ConfirmPassword must be same';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tconsole.log('valide password');\r\n");
      out.write("\t\t\t\tdocument.getElementById('passwordError').innerHTML = '';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tconsole.log('invalide password');\r\n");
      out.write("\t\t\t\tdocument.getElementById('passwordError').innerHTML = 'Plese enter valide password';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /signUp.jsp(33,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/signUp.jsp(33,2) '${errors}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${errors}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /signUp.jsp(33,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("e");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
