/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2020-09-17 14:25:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("      <title>Container System</title>\r\n");
      out.write("      <meta charset=\"utf-8\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,700,900|Display+Playfair:200,300,400,700\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/fonts/icomoon/style.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/bootstrap.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/magnific-popup.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/jquery-ui.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/owl.carousel.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/owl.theme.default.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/bootstrap-datepicker.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/fonts/flaticon/font/flaticon.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://fontawesome.com/icons\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/aos.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/style.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("      <!--===============================================================================================-->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\r\n");
      out.write("      <!--===============================================================================================-->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/animate/animate.css\">\r\n");
      out.write("      <!--===============================================================================================-->  \r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("      <!--===============================================================================================-->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("      <!--===============================================================================================-->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/select2/select2.min.css\">\r\n");
      out.write("      <!--===============================================================================================-->  \r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("      <!--===============================================================================================-->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/util.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main.css\">\r\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js\"></script>\r\n");
      out.write("      <style type=\"text/css\">\r\n");
      out.write("         .ml2 {\r\n");
      out.write("         font-weight: 500;\r\n");
      out.write("         font-size: 0.5cm;\r\n");
      out.write("         color: white;\r\n");
      out.write("         }\r\n");
      out.write("         .ml2 .letter {\r\n");
      out.write("         display: inline-block;\r\n");
      out.write("         line-height: 1em;\r\n");
      out.write("         }\r\n");
      out.write("         <!-- -->\r\n");
      out.write("         .ml9 {\r\n");
      out.write("         position: relative;\r\n");
      out.write("         font-weight: 200;\r\n");
      out.write("         font-size: 2.5em;\r\n");
      out.write("         color: #ff9933;\r\n");
      out.write("         }\r\n");
      out.write("         .ml9 .text-wrapper {\r\n");
      out.write("         position: relative;\r\n");
      out.write("         display: inline-block;\r\n");
      out.write("         padding-top: 0.2em;\r\n");
      out.write("         padding-right: 0.05em;\r\n");
      out.write("         padding-bottom: 0.1em;\r\n");
      out.write("         overflow: hidden;\r\n");
      out.write("         }\r\n");
      out.write("         .ml9 .letter {\r\n");
      out.write("         transform-origin: 50% 100%;\r\n");
      out.write("         display: inline-block;\r\n");
      out.write("         line-height: 1em;\r\n");
      out.write("         }\r\n");
      out.write("         <!-- -->\r\n");
      out.write("         .ml3 {\r\n");
      out.write("         font-weight: 200;\r\n");
      out.write("         font-size: 2.5em;\r\n");
      out.write("         color: #ff9933;\r\n");
      out.write("         }\r\n");
      out.write("         .site-navbar{\r\n");
      out.write("         background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/Banner1.jpg');\r\n");
      out.write("         background-repeat: repeat-x;\r\n");
      out.write("         }\r\n");
      out.write("         .center-block {\r\n");
      out.write("         display: block;\r\n");
      out.write("         margin-right: auto;\r\n");
      out.write("         margin-left: auto;\r\n");
      out.write("         }\r\n");
      out.write("         .text-block {\r\n");
      out.write("         position: absolute;\r\n");
      out.write("         bottom: 20px;\r\n");
      out.write("         right: 20px;\r\n");
      out.write("         background-color:grey;\r\n");
      out.write("         color: white;\r\n");
      out.write("         padding-left: 20px;\r\n");
      out.write("         padding-right: 20px;\r\n");
      out.write("         }\r\n");
      out.write("      </style>\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("      <div class=\"site-wrap\">\r\n");
      out.write("         <div class=\"site-mobile-menu\">\r\n");
      out.write("            <div class=\"site-mobile-menu-header\">\r\n");
      out.write("               <div class=\"site-mobile-menu-close mt-3\">\r\n");
      out.write("                  <span class=\"icon-close2 js-menu-toggle\"></span>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"site-mobile-menu-body\"></div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <header class=\"site-navbar py-3\" role=\"banner\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("               <div class=\"row align-items-center\">\r\n");
      out.write("                  <div class=\"col-11 col-xl-2\">\r\n");
      out.write("                     <h1 class=\"mb-0\"><a href=\"#\" class=\"text-white h2 mb-0\">SRAM Container</a></h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-12 col-md-10 d-none d-xl-block\">\r\n");
      out.write("                     <nav class=\"site-navigation position-relative text-right\" role=\"navigation\">\r\n");
      out.write("                        <ul class=\"site-menu js-clone-nav mx-auto d-none d-lg-block\">\r\n");
      out.write("                           <li><a href=\"index\">Home</a></li>\r\n");
      out.write("                           <li class=\"has-children\">\r\n");
      out.write("                              <a>Services</a>\r\n");
      out.write("                              <ul class=\"dropdown\">\r\n");
      out.write("                                 <li> \r\n");
      out.write("                                 <li class=\"has-children\">\r\n");
      out.write("                                    <a>Storage</a>\r\n");
      out.write("                                    <ul class=\"dropdown\">\r\n");
      out.write("                                       <li>\r\n");
      out.write("                                          <a href=\"#\">Dry Container</a>\r\n");
      out.write("                                          <a href=\"cold\">Cold Container</a>\r\n");
      out.write("                                       </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                 </li>\r\n");
      out.write("                                 </li>\r\n");
      out.write("                                 <li><a href=\"shipping\">Transport</a></li>\r\n");
      out.write("                                 <li><a href=\"shipping\">Shipping</a></li>\r\n");
      out.write("                              </ul>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li><a href=\"contact\">Contact Us</a></li>\r\n");
      out.write("                           <li><a href=\"about\">About Us</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                     </nav>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"d-inline-block d-xl-none ml-md-0 mr-auto py-3\" style=\"position: relative; top: 3px;\"><a href=\"#\" class=\"site-menu-toggle js-menu-toggle text-white\"><span class=\"icon-menu h3\"></span></a></div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </header>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"row align-items-center justify-content-center text-center\">\r\n");
      out.write("            <div class=\"col-md-8\" data-aos=\"fade-up\" data-aos-delay=\"400\">\r\n");
      out.write("               <!-- Services -->\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--  -->\r\n");
      out.write("      <br />\r\n");
      out.write("      <br />\r\n");
      out.write("      <!--  -->    \r\n");
      out.write("      <div class=\"site-section bg-light\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <div>\r\n");
      out.write("               <h1 style=\"text-align: center;\">Dry Storage Container</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-12\"> \r\n");
      out.write("                  <img  class=\"center-block\" alt=\"dry1\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/dry1.png\"> \r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row align-items-stretch\">\r\n");
      out.write("               <div class=\" col-lg-4 \">\r\n");
      out.write("                  <h5>6 FEET STORAGE CONTAINER :</h5>\r\n");
      out.write("                  <p>\r\n");
      out.write("                     The 6 feet storage container is our smallest basic storage container. It is the perfect solution for construction\r\n");
      out.write("                     sites and narrow places, such as city center yards. The container can even be transported with a normal car \r\n");
      out.write("                     and trailer if needed! The 6 feet storage container is equipped with pair doors on one side, with the option \r\n");
      out.write("                     to use a padlock for extra security. The basic model comes with a 25 mm thick wooden floor, but is also available\r\n");
      out.write("                     with plywood and steel riffled sheet floor. Available with plenty of accessories to choose from.The container is\r\n");
      out.write("                     only suitable for storage usage.\r\n");
      out.write("                     Dimensions\r\n");
      out.write("                     Length: 1800 mm, Width: 1750 mm, Height: 1900 mm\r\n");
      out.write("                     Inner dimensions\r\n");
      out.write("                     Length: 1628 mm, Width: 1670 mm, Height: 1719 mm. Capacity: 4,5 m3\r\n");
      out.write("                  </p>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\" col-lg-4\">\r\n");
      out.write("                  <!--  <div class=\"unit-4 d-flex\">  -->\r\n");
      out.write("                  <h5>8 FEET STORAGE CONTAINER :</h5>\r\n");
      out.write("                  <p>The 8 feet storage container is our smallest basic storage container. It is the perfect solution for construction \r\n");
      out.write("                     sites and narrow places, such as city center yards. The container can even be transported with a normal car and \r\n");
      out.write("                     trailer if needed! The storage container is equipped with pair doors on one side, with the option to use a padlock\r\n");
      out.write("                     for extra security. The basic model comes with a 25 mm thick wooden floor, but is also available with plywood and steel\r\n");
      out.write("                     riffled sheet floor. Available with plenty of accessories to choose from.The container is only suitable for storage usage.\r\n");
      out.write("                     Dimensions\r\n");
      out.write("                     Length: 2438 mm, Width: 2200 mm, Height: 2250 mm\r\n");
      out.write("                     Inner dimensions\r\n");
      out.write("                     Length: 2270 mm, Width: 2090 mm, Height: 2065 mm. Capacity: 8,5 m3\r\n");
      out.write("                  </p>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-lg-4 \">\r\n");
      out.write("                  <!-- <div class=\"unit-4 d-flex\">  -->\r\n");
      out.write("                  <h5>10 FEET STORAGE CONTAINER:</h5>\r\n");
      out.write("                  <p>The 10 feet (3 m) storage container provides 15 m3 safe and weatherproof space that can be easily moved around.\r\n");
      out.write("                     The container is equipped with pair doors on one side, with the option to use padlock for extra security. Our \r\n");
      out.write("                     basic model comes with a 25 mm thick wooden floor, but is also available fitted with plywood or steel riffled sheet\r\n");
      out.write("                     floor. Available with plenty of accessories and equipment to choose from.The container is only suitable for storage \r\n");
      out.write("                     usage.\r\n");
      out.write("                     Dimensions\r\n");
      out.write("                     Length: 2991 mm, Width: 2438 mm, Height: 2591 mm\r\n");
      out.write("                     Inner dimensions\r\n");
      out.write("                     Length: 2830 mm, Width: 2329 mm, Height: 2390 mm. Capacity: 15 m3\r\n");
      out.write("                  </p>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-sm-4\">\r\n");
      out.write("                  <div class=\"container-login100-form-btn m-t-32\">\r\n");
      out.write("                   <a href=\"login\" >\r\n");
      out.write("                     <button class=\"login100-form-btn\" onClick=\" return validation2()\">\r\n");
      out.write("                   Order                               \r\n");
      out.write("                     </button>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-sm-4\">\r\n");
      out.write("                  <div class=\"container-login100-form-btn m-t-32\">\r\n");
      out.write("                      <a href=\"login\" >\r\n");
      out.write("                     <button class=\"login100-form-btn\" onClick=\" return validation2()\">\r\n");
      out.write("                   Order                               \r\n");
      out.write("                     </button>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-sm-4\">\r\n");
      out.write("                  <div class=\"container-login100-form-btn m-t-32\">\r\n");
      out.write("                     <a href=\"login\" >\r\n");
      out.write("                     <button class=\"login100-form-btn\" onClick=\" return validation2()\">\r\n");
      out.write("                   Order                               \r\n");
      out.write("                     </button>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("         <!-- <div class=\"row align-items-stretch\"> -->\r\n");
      out.write("         <div class=\"col-md-12\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("               <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/container.jpg\" alt=\"Norway\" style=\"width:100%;\">\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- </div> -->  \t\r\n");
      out.write("      </div>\r\n");
      out.write("      <footer class=\"site-footer\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-12\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                     <div class=\"col-md-3\">\r\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">Quick Links</h2>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                           <li><a href=\"index\">Home</a></li>\r\n");
      out.write("                           <li><a href=\"about\">About Us</a></li>\r\n");
      out.write("                           <li><a href=\"contact\">Contact Us</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col-md-3\">\r\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">Services</h2>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                           <li><a href=\"#\">Dry Container</a></li>\r\n");
      out.write("                           <li><a href=\"cold\">Cold Container</a></li>\r\n");
      out.write("                           <li><a href=\"shipping\">Shipping</a></li>\r\n");
      out.write("                           <li><a href=\"shipping\">Transport</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col-md-3\">\r\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">Contact</h2>\r\n");
      out.write("                        <!-- Links -->\r\n");
      out.write("                        <p>\r\n");
      out.write("                           <i class=\"fas fa-home\"></i> India\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                           <i class=\"far fa-envelope\"></i> info@sram.com\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                           <i class=\"fas fa-phone\"></i> + 01 234 567 88\r\n");
      out.write("                        </p>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <!-- Grid column -->\r\n");
      out.write("                     <div class=\"col-md-3\">\r\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">Follow Us</h2>\r\n");
      out.write("                        <a href=\"#\" class=\"pl-0 pr-3\"><span class=\"icon-facebook\"></span></a>\r\n");
      out.write("                        <a href=\"#\" class=\"pl-3 pr-3\"><span class=\"icon-twitter\"></span></a>\r\n");
      out.write("                        <a href=\"#\" class=\"pl-3 pr-3\"><span class=\"icon-instagram\"></span></a>\r\n");
      out.write("                        <a href=\"#\" class=\"pl-3 pr-3\"><span class=\"icon-linkedin\"></span></a>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-migrate-3.0.1.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-ui.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/popper.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/owl.carousel.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.stellar.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.countdown.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/aos.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("         anime.timeline({loop: true})\r\n");
      out.write("         .add({\r\n");
      out.write("           targets: '.ml5 .line',\r\n");
      out.write("           opacity: [0.5,1],\r\n");
      out.write("           scaleX: [0, 1],\r\n");
      out.write("           easing: \"easeInOutExpo\",\r\n");
      out.write("           duration: 700\r\n");
      out.write("         }).add({\r\n");
      out.write("           targets: '.ml5 .line',\r\n");
      out.write("           duration: 600,\r\n");
      out.write("           easing: \"easeOutExpo\",\r\n");
      out.write("           translateY: (el, i) => (-0.625 + 0.625*2*i) + \"em\"\r\n");
      out.write("         }).add({\r\n");
      out.write("           targets: '.ml5 .ampersand',\r\n");
      out.write("           opacity: [0,1],\r\n");
      out.write("           scaleY: [0.5, 1],\r\n");
      out.write("           easing: \"easeOutExpo\",\r\n");
      out.write("           duration: 600,\r\n");
      out.write("           offset: '-=600'\r\n");
      out.write("         }).add({\r\n");
      out.write("           targets: '.ml5 .letters-left',\r\n");
      out.write("           opacity: [0,1],\r\n");
      out.write("           translateX: [\"0.5em\", 0],\r\n");
      out.write("           easing: \"easeOutExpo\",\r\n");
      out.write("           duration: 600,\r\n");
      out.write("           offset: '-=300'\r\n");
      out.write("         }).add({\r\n");
      out.write("           targets: '.ml5 .letters-right',\r\n");
      out.write("           opacity: [0,1],\r\n");
      out.write("           translateX: [\"-0.5em\", 0],\r\n");
      out.write("           easing: \"easeOutExpo\",\r\n");
      out.write("           duration: 600,\r\n");
      out.write("           offset: '-=600'\r\n");
      out.write("         }).add({\r\n");
      out.write("           targets: '.ml5',\r\n");
      out.write("           opacity: 0,\r\n");
      out.write("           duration: 1000,\r\n");
      out.write("           easing: \"easeOutExpo\",\r\n");
      out.write("           delay: 1000\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("      <script>\r\n");
      out.write("         var textWrapper = document.querySelector('.ml2');\r\n");
      out.write("         textWrapper.innerHTML = textWrapper.textContent.replace(/\\S/g, \"<span class='letter'>$&</span>\");\r\n");
      out.write("         \r\n");
      out.write("         anime.timeline({loop: true})\r\n");
      out.write("           .add({\r\n");
      out.write("             targets: '.ml2 .letter',\r\n");
      out.write("             scale: [4,1],\r\n");
      out.write("             opacity: [0,1],\r\n");
      out.write("             translateZ: 0,\r\n");
      out.write("             easing: \"easeOutExpo\",\r\n");
      out.write("             duration: 950,\r\n");
      out.write("             delay: (el, i) => 70*i\r\n");
      out.write("           }).add({\r\n");
      out.write("             targets: '.ml2',\r\n");
      out.write("             opacity: 0,\r\n");
      out.write("             duration: 1000,\r\n");
      out.write("             easing: \"easeOutExpo\",\r\n");
      out.write("             delay: 1000\r\n");
      out.write("           });\r\n");
      out.write("      </script>\r\n");
      out.write("      <script>\r\n");
      out.write("         var textWrapper = document.querySelector('.ml9 .letters');\r\n");
      out.write("         textWrapper.innerHTML = textWrapper.textContent.replace(/\\S/g, \"<span class='letter'>$&</span>\");\r\n");
      out.write("         \r\n");
      out.write("         anime.timeline({loop: true})\r\n");
      out.write("           .add({\r\n");
      out.write("             targets: '.ml9 .letter',\r\n");
      out.write("             scale: [0, 1],\r\n");
      out.write("             duration: 1500,\r\n");
      out.write("             elasticity: 600,\r\n");
      out.write("             delay: (el, i) => 45 * (i+1)\r\n");
      out.write("           }).add({\r\n");
      out.write("             targets: '.ml9',\r\n");
      out.write("             opacity: 0,\r\n");
      out.write("             duration: 1000,\r\n");
      out.write("             easing: \"easeOutExpo\",\r\n");
      out.write("             delay: 1000\r\n");
      out.write("           });\r\n");
      out.write("      </script>\r\n");
      out.write("      <script>\r\n");
      out.write("         var textWrapper = document.querySelector('.ml3');\r\n");
      out.write("         textWrapper.innerHTML = textWrapper.textContent.replace(/\\S/g, \"<span class='letter'>$&</span>\");\r\n");
      out.write("         \r\n");
      out.write("         anime.timeline({loop: true})\r\n");
      out.write("           .add({\r\n");
      out.write("             targets: '.ml3 .letter',\r\n");
      out.write("             opacity: [0,1],\r\n");
      out.write("             easing: \"easeInOutQuad\",\r\n");
      out.write("             duration: 2250,\r\n");
      out.write("             delay: (el, i) => 150 * (i+1)\r\n");
      out.write("           }).add({\r\n");
      out.write("             targets: '.ml3',\r\n");
      out.write("             opacity: 0,\r\n");
      out.write("             duration: 1000,\r\n");
      out.write("             easing: \"easeOutExpo\",\r\n");
      out.write("             delay: 1000\r\n");
      out.write("           });\r\n");
      out.write("      </script>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}