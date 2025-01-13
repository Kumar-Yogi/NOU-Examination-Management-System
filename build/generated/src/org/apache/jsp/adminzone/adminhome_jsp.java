package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\n");
      out.write("    \n");
      out.write("    <script src=\"JS/bootstrap.bundle.js\"></script>\n");
      out.write("    <style>\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Barlow+Semi+Condensed:ital,wght@1,700&family=Inconsolata:wght@300&family=Ubuntu:ital,wght@0,300;0,400;1,500;1,700&display=swap');\n");
      out.write("\n");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: \"Ubuntu\", sans-serif;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(":root{\n");
      out.write("    --orange:#ff6600;\n");
      out.write("    --white:#fff;\n");
      out.write("    --gray:#f5f5f5;\n");
      out.write("    --black01:#222;\n");
      out.write("    --black02:#999;\n");
      out.write("    --backgound:#d4f7acb4;\n");
      out.write("    --yellow:#ffc107;\n");
      out.write("    --navy:#04014a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    min-height: 100vh;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dashboard-header{\n");
      out.write("    min-height: 60px;\n");
      out.write("    border: 1px solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main{\n");
      out.write("    min-height: 646px;\n");
      out.write("    border: 1px solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dashboard-menu{\n");
      out.write("    min-height: 100%;\n");
      out.write("    border: 1px solid;\n");
      out.write("    background-color: #04014a;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dashboard-main{\n");
      out.write("    min-height: 100%;\n");
      out.write("    border: 1px solid;\n");
      out.write("    /* background-color: #04014a; */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dashboard-menu ul li{\n");
      out.write("    text-decoration: none;\n");
      out.write("    list-style-type: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dash-menu{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 20px;\n");
      out.write("    font-weight: 400;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dash-menu:hover{\n");
      out.write("    color: #ffc107;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* card css start */\n");
      out.write("\n");
      out.write(".cardbox{\n");
      out.write("    position: relative;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 20px;\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: repeat(4, 1fr);\n");
      out.write("    grid-gap: 30px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
      out.write("  .cardbox .Card{\n");
      out.write("    position:relative;\n");
      out.write("    background: var(--white );\n");
      out.write("    padding: 25px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    cursor: pointer;\n");
      out.write("    box-shadow: 0 7px 25px rgba(0, 0, 0, 0.08);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .cardbox .Card .number{\n");
      out.write("    position: relative;\n");
      out.write("    font-weight: 500;\n");
      out.write("    font-size: 2.2rem;\n");
      out.write("    font-weight: 700;\n");
      out.write("    color: var(--yellow);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .cardbox .Card .cardName{\n");
      out.write("    color: var(--navy);\n");
      out.write("    font-size: 1.1rem;\n");
      out.write("    margin-top: 5px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .cardbox .Card .iconBox{\n");
      out.write("    font-size: 3rem;\n");
      out.write("    color: var(--white);\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".cardbox .Card:hover{\n");
      out.write("    background: var(--navy);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cardbox .Card:hover .number,\n");
      out.write(".cardbox .Card:hover .cardName,\n");
      out.write(".cardbox .Card:hover .iconBox{\n");
      out.write("    color: var(--yellow);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* toggle button css */\n");
      out.write(".toggle{\n");
      out.write("    /* position: relative; */\n");
      out.write("    top: 0;\n");
      out.write("    right: 0;\n");
      out.write("    width: 50px;\n");
      out.write("    height: 45px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    /* display: flex;\n");
      out.write("    align-items: center; */\n");
      out.write("    padding-left: 12px;\n");
      out.write("    font-size: 1.8rem;\n");
      out.write("    color: #04014a;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border: 1px solid #04014a;    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".toggle:hover{\n");
      out.write("    color: #ffc107;\n");
      out.write("    border: 1px solid #ffc107;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media   (max-width:991px){\n");
      out.write("    .dashboard-menu{\n");
      out.write("        left: -300px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dashboard-menu.active{\n");
      out.write("        width: 300px;\n");
      out.write("        left: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dashboard-main{\n");
      out.write("        width: 100%;\n");
      out.write("        left: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dashboard-main.active{\n");
      out.write("        left: 300px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .cardbox{\n");
      out.write("        grid-template-columns: repeat(2, 1fr);\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("   \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(" \n");
      out.write("@media only screen and (max-width:991px){\n");
      out.write("    .cardbox{\n");
      out.write("        grid-template-columns: repeat(2, 1fr);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("/* toggle button css */\n");
      out.write("\n");
      out.write("/* card css closed */\n");
      out.write("\n");
      out.write("/* ------------Curve outside------------------- */\n");
      out.write("/* \n");
      out.write(".dashboard-menu ul li:hover a::before,\n");
      out.write(".dashboard-menu ul li.hovered a::before{\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    right: 0;\n");
      out.write("    top:-50px;\n");
      out.write("    width: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    background-color:transparent;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    box-shadow: 35px 35px 0 10px var(--white);\n");
      out.write("    pointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dashboard-menu ul li:hover a::after,\n");
      out.write(".dashboard-menu ul li.hovered a::after{\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    right: 0;\n");
      out.write("    bottom:-50px;\n");
      out.write("    width: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    background-color: transparent;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    box-shadow: 35px -35px 0 10px var(--white);\n");
      out.write("    pointer-events: none;\n");
      out.write("} */\n");
      out.write("\n");
      out.write(".logout-btn{\n");
      out.write("    /* text-decoration: none; */\n");
      out.write("    color: #04014a;\n");
      out.write("    font-size: 20px;\n");
      out.write("    font-weight: 400;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logout-btn:hover{\n");
      out.write("    color: #ffc107;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <!-- dashboard header section statred -->\n");
      out.write("        <div class=\"row dashboard-header\">\n");
      out.write("            <div class=\"col-sm-1\" style=\"min-height: 100%; border: 1px solid;\">\n");
      out.write("                <div class=\"toggle mt-2\">\n");
      out.write("                    <i class=\"fa-solid fa-bars\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-4\" style=\"min-height: 100%; border: 1px solid;\">\n");
      out.write("                <h2 style=\"align-items: center; justify-content: center; text-align: center; color: #04014a; font-weight: bold;\" class=\"mt-2\">NALANDA OPEN UNIVERSITY</h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6\" style=\"min-height: 100%; border: 1px solid;\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-1\" style=\"min-height: 100%; border: 1px solid;\">\n");
      out.write("            <img src=\"Images/u1.png\" height=\"50px;\" width=\"50px;\" class=\"mt-1\" alt=\"Profile\">\n");
      out.write("            <i class=\"fa-solid fa-right-from-bracket me-3 logout-btn\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- dashboard header section closed -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- dashboard outer-main section statred -->\n");
      out.write("        <div class=\"row main\">\n");
      out.write("            <!-- dashboard menu section started -->\n");
      out.write("            <div class=\"col-sm-2 dashboard-menu\">\n");
      out.write("                \n");
      out.write("        <ul>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-house me-3\"></i>Home</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-users me-3\"></i>Students</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-user-gear me-3\"></i>Enquiry</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-book me-3\"></i>Question Bank</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-square-poll-vertical me-3\"></i>Result</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-calendar-days me-3\"></i>News & Event</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-lock me-3\"></i>Change Password</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mt-4\">\n");
      out.write("            <a href=\"#\" class=\"dash-menu\">\n");
      out.write("              <span class=\"title\"><i class=\"fa-solid fa-right-from-bracket me-3\"></i>Log Out</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- dashboard main section closed -->\n");
      out.write("            <div class=\"col-sm-10 dashboar-main\">\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"header-box\">\n");
      out.write("                        <!-----------------------Card Box--------------------- - -->\n");
      out.write("                        <div class=\"cardbox\">\n");
      out.write("                          <div class=\"col-sm-3\" style=\" width: 100%;\">\n");
      out.write("                            <!-- First card -->\n");
      out.write("                          <div class=\"Card\">\n");
      out.write("                            <div>\n");
      out.write("                              <div class=\"number counter\">500</div>\n");
      out.write("                              <div class=\"cardName\">My Question</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"iconBox\">\n");
      out.write("                              <ion-icon name=\"people-outline\"></ion-icon>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                          <div class=\"col-sm-3\" style=\" width: 100%;\">\n");
      out.write("                            <!-- Second card -->\n");
      out.write("                          <div class=\"Card\">\n");
      out.write("                            <div>\n");
      out.write("                              <div class=\"number counter\">800</div>\n");
      out.write("                              <div class=\"cardName\">Question bank</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"iconBox\">\n");
      out.write("                              <ion-icon name=\"cloud-upload-outline\"></ion-icon>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                          <div class=\"col-sm-3\" style=\" width: 100%;\">\n");
      out.write("                            <!-- Third card -->\n");
      out.write("                          <div class=\"Card\">\n");
      out.write("                            <div>\n");
      out.write("                              <div class=\"number counter\">30</div>\n");
      out.write("                              <div class=\"cardName\">Answer</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"iconBox\">\n");
      out.write("                              <ion-icon name=\"arrow-redo-outline\"></ion-icon>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                          <div class=\"col-sm-3\" style=\" width: 100%;\">\n");
      out.write("                            <!-- Fourth card -->\n");
      out.write("                          <div class=\"Card\">\n");
      out.write("                            <div>\n");
      out.write("                              <div class=\"number counter\">30</div>\n");
      out.write("                              <div class=\"cardName\">Answer</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"iconBox\">\n");
      out.write("                              <ion-icon name=\"arrow-redo-outline\"></ion-icon>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          </div>\n");
      out.write("                          \n");
      out.write("              \n");
      out.write("                          \n");
      out.write("              \n");
      out.write("                          \n");
      out.write("\n");
      out.write("                          \n");
      out.write("                      \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        <!-- dashboard main section closed -->\n");
      out.write("        </div>\n");
      out.write("        <!-- dashboard outer-main section closed -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        //Add hovered class to selsect list item\n");
      out.write("\n");
      out.write("let list = document.querySelectorAll(\".dashboard-menu li\")\n");
      out.write("\n");
      out.write("function activeLink(){\n");
      out.write("    list.forEach(item=>{\n");
      out.write("        item.classList.remove(\"hovered\");\n");
      out.write("    })\n");
      out.write("    this.classList.add(\"hovered\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("list.forEach(item => item.addEventListener(\"mouseover\", activeLink));\n");
      out.write("\n");
      out.write("\n");
      out.write("//Menu toggle sectiojn start\n");
      out.write("\n");
      out.write("let toggle = document.querySelector(\".toggle\");\n");
      out.write("let navigation = document.querySelector(\".dashboard-menu\");\n");
      out.write("let main = document.querySelector(\".dashboard-main\");\n");
      out.write("\n");
      out.write("toggle.onclick = function (){\n");
      out.write("    navigation.classList.toggle(\"active\");\n");
      out.write("    main.classList.toggle(\"active\");\n");
      out.write("};\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}