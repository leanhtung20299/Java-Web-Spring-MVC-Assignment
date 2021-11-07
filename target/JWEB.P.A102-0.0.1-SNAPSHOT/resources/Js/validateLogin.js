$(document).ready(function () {
    // event handler with login function
    $(document).on('click', '#btn-signin', function () {
        $('.massageText').hide();
        var Alias = document.getElementById('txt-input1').value;
        var Password = document.getElementById('txt-input2').value;
        $('#txt-input1').css("border-color", "green");
        $('#txt-input2').css("border-color", "green");
        if (Alias.includes(" ")) {
            $('#txt-input1').css("border-color", "red");
            $(('<div class="row"><div class = "massage  massageText">Requires not contain special characters</div></div>')).insertAfter($('#txt-input1'));
        }
        else if (Alias.length == 0) {
            $('#txt-input1').css("border-color", "red");
            $(('<div class="row"><div class = "massage  massageText">Request do not leave blank</div></div>')).insertAfter($('#txt-input1'));
        }
        else if (Alias.length < 6 || Alias.length > 20) {
            $('#txt-input1').css("border-color", "red");
            $(('<div class="row"><div class = "massage  massageText">Requires 6 to 20 characters</div></div>')).insertAfter($('#txt-input1'));
        }

        if (Password.includes(" ")) {
            $('#txt-input2').css("border-color", "red");
            $(('<div class="row"><div class = "massage  massageText">Requires not contain special characters</div></div>')).insertAfter($('#txt-input2'));
        }
        else if (Password.length == 0) {
            $('#txt-input2').css("border-color", "red");
            $(('<div class="row"><div class = "massage  massageText">Request do not leave blank</div></div>')).insertAfter($('#txt-input2'));
        }
        else if (Password.length < 6 || Password.length > 20) {
            $('#txt-input2').css("border-color", "red");
            $(('<div class="row"><div class = "massage  massageText">Requires 6 to 20 characters</div></div>')).insertAfter($('#txt-input2'));
        }
        $('.massageText').css("color", "red");
        $('.massageText').css("margin-left", "5%");
    });

    // add Css header for Modal box
    $(document).on('click', '#btn-loginsubmit', function () {
        $('head').append(" <link rel='stylesheet' class = 'modalCss' type='text/css' media='screen' href='../Css/modal.css'> ");
    });

    // Cancel Modal box
    $(document).on('click', '.cancelbtn', function () {
        $('.modalCss').remove();
    });
});