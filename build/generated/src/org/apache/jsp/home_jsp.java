package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Home | IT-Shopper</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->       \n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head><!--/head-->\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <section id=\"slider\"><!--slider-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div id=\"slider-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ol>\n");
      out.write("\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>IT</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>Free E-Commerce Template</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"http://developertesting.rocks/wp-content/uploads/2016/08/book_front_cover.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>IT</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>Top1 Saled</h2>\n");
      out.write("                                        <p>Ahaha </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"https://cuongquach.com/wp-content/uploads/2017/08/ebook-clean-code-pdf.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\n");
      out.write("                                <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section><!--/slider-->\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"left-sidebar\">\n");
      out.write("                            <h2>Category</h2>\n");
      out.write("                            <div class=\"panel-group category-products\" id=\"accordian\"><!--category-products-->\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\">\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordian\" href=\"#womens\">\n");
      out.write("                                                <span class=\"badge pull-right\"><i class=\"fa fa-plus\"></i></span>\n");
      out.write("                                                Womens\n");
      out.write("                                            </a>\n");
      out.write("                                        </h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"womens\" class=\"panel-collapse collapse\">\n");
      out.write("                                        <div class=\"panel-body\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><a href=\"#\">Fendi</a></li>\n");
      out.write("                                                <li><a href=\"#\">Guess</a></li>\n");
      out.write("                                                <li><a href=\"#\">Valentino</a></li>\n");
      out.write("                                                <li><a href=\"#\">Dior</a></li>\n");
      out.write("                                                <li><a href=\"#\">Versace</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">Kids</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"#\">Shoes</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/category-products-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"price-range\"><!--price-range-->\n");
      out.write("                                <h2>Price Range</h2>\n");
      out.write("                                <div class=\"well text-center\">\n");
      out.write("                                    <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" data-slider-max=\"600\" data-slider-step=\"5\" data-slider-value=\"[0,450]\" id=\"sl2\" ><br />\n");
      out.write("                                    <b class=\"pull-left\">$ 0</b> <b class=\"pull-right\">$ 600</b>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/price-range-->\n");
      out.write("\n");
      out.write("                            <div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("                                <img src=\"images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("                            </div><!--/shipping-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-9 padding-right\">\n");
      out.write("                        <div class=\"features_items\"><!--features_items-->\n");
      out.write("                            <h2 class=\"title text-center\">Features Items</h2>\n");
      out.write("                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div><!--features_items-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"recommended_items\"><!--recommended_items-->\n");
      out.write("                            <h2 class=\"title text-center\">recommended items</h2>\n");
      out.write("\n");
      out.write("                            <div id=\"recommended-item-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"item active\">\t\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <div class=\"product-image-wrapper\">\n");
      out.write("                                                <div class=\"single-products\">\n");
      out.write("                                                    <div class=\"productinfo text-center\">\n");
      out.write("                                                        <img src=\"http://developertesting.rocks/wp-content/uploads/2016/08/book_front_cover.jpg\" alt=\"\" />\n");
      out.write("                                                        <h2>$56</h2>\n");
      out.write("                                                        <p>Easy Polo Black Edition</p>\n");
      out.write("                                                        <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <div class=\"product-image-wrapper\">\n");
      out.write("                                                <div class=\"single-products\">\n");
      out.write("                                                    <div class=\"productinfo text-center\">\n");
      out.write("                                                        <img src=\"https://cuongquach.com/wp-content/uploads/2017/08/ebook-clean-code-pdf.jpg\" alt=\"\" />\n");
      out.write("                                                        <h2>$56</h2>\n");
      out.write("                                                        <p>Easy Polo Black Edition</p>\n");
      out.write("                                                        <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <div class=\"product-image-wrapper\">\n");
      out.write("                                                <div class=\"single-products\">\n");
      out.write("                                                    <div class=\"productinfo text-center\">\n");
      out.write("                                                        <img src=\"https://images.routledge.com/common/jackets/crclarge/978082474/9780824746179.jpg\" alt=\"\" />\n");
      out.write("                                                        <h2>$56</h2>\n");
      out.write("                                                        <p>Easy Polo Black Edition</p>\n");
      out.write("                                                        <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a class=\"left recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"prev\">\n");
      out.write("                                    <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"right recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"next\">\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--/recommended_items-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.DONE}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <script>\n");
        out.write("                swal(\"SORRY!\", \"dddddd\");\n");
        out.write("            </script>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("searchValue");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SEARCH_VALUE}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty searchValue}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("listBook");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SEARCH_RESULT}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty searchValue}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_set_2.setVar("listBook");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.BOOK}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty listBook}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_0.setVar("book");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBook}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"col-sm-4\">\n");
          out.write("                                        <div class=\"product-image-wrapper\">\n");
          out.write("                                            <div class=\"single-products\">\n");
          out.write("                                                <div class=\"productinfo text-center\">\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    <a href=\"MainController?btAction=addToCart&txtId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id.trim()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"product-overlay\">\n");
          out.write("                                                    <div class=\"overlay-content\">\n");
          out.write("                                                        <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                        <a href=\"MainController?btAction=addToCart&txtId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"choose\">\n");
          out.write("                                                <ul class=\"nav nav-pills nav-justified\">\n");
          out.write("                                                    <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Detail</a></li>\n");
          out.write("                                                    <li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Add to compare</a></li>\n");
          out.write("                                                </ul>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty listBook}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <h2>NO PRODUCT</h2>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}
