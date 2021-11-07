$(document).ready(function () {

    // Ajax load Create page
    $("#Createpage").unbind().click(function () {
        $('.modalCss').remove();
        $.get({
            url: "/JWEB.P.A102/jsp/Createpage.jsp",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/JWEB.P.A102/jsp/modalLogin.jsp",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);
            }
        });
    });

    // Ajax load List page
    $("#Listpage").unbind().click(function () {
        $.get({
            url: "/JWEB.P.A102/jsp/Listpage.jsp",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/JWEB.P.A102/jsp/modalLogin.jsp",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);
            }
        });
    });

    // Ajax load Home page
    $('#Homepage1').unbind().click(function () {
        $.get({
            url: "/JWEB.P.A102/jsp/Homepage.jsp",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/JWEB.P.A102/jsp/modalLogin.jsp",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);

            }
        });
    });

    // Ajax load Home page
    $('#Homepage2').unbind().click(function () {

        $.get({
            url: "/JWEB.P.A102/jsp/Homepage.jsp",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/JWEB.P.A102/jsp/modalLogin.jsp",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);

            }
        });
    });
});