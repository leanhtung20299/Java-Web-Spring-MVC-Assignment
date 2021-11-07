$(document).ready(function () {

    // Ajax load Create page
    $("#Createpage").unbind().click(function () {
        $('.modalCss').remove();
        $.get({
            url: "/view/Createpage.html",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/view/modalLogin.html",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);
            }
        });
    });

    // Ajax load List page
    $("#Listpage").unbind().click(function () {
        $.get({
            url: "/view/Listpage.html",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/view/modalLogin.html",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);
            }
        });
    });

    // Ajax load Home page
    $('#Homepage1').unbind().click(function () {
        $.get({
            url: "/view/Homepage.html",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/view/modalLogin.html",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);

            }
        });
    });

    // Ajax load Home page
    $('#Homepage2').unbind().click(function () {

        $.get({
            url: "/view/Homepage.html",
            success: function (response) {
                var newDOM = response.split("<body")[1].split(">").slice(1).join(">").split("</body>")[0];
                $("body").html(newDOM);
            }
        });
        $.get({
            url: "/view/modalLogin.html",
            success: function (response) {
                if ($("#id01") == false)
                    $("nav").insertAfter(response);

            }
        });
    });
});