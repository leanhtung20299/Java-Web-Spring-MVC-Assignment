// Add answer from button function
$(document).ready(function () {
    $(document).on('click', '.addAnswer', function () {
        var shows = Array.prototype.slice.call($('.addAnswer'));
        var index = shows.indexOf(this);
        if ($(this).hasClass("unclickable")) {
            e.preventDefault();
        }
        else {
            $(this).addClass("unclickable");

            var addAnswer = '<input type="text" class="form-control textValidate1" placeholder="Type your answer">';

            var shows = Array.prototype.slice.call($('.addAnswer'));
            var index = shows.indexOf(this);

            $(addAnswer).insertBefore($(".listAnswer").eq(index));

            setTimeout(function () {
                $($('.addAnswer')[index]).removeClass("unclickable");
            }, 500);
        }

    })

    // Add new question 
    $(".addQuestion").on('click', function () {
        var formQuestionAdd1 = document.getElementById('formQuestionAdd1').innerHTML;
        var lengthQuestion = document.getElementsByClassName('formQuestionAdd').length;
        var htmlQuestion2 = ' <div class="process"><div class="row">'
            + ' <div class="col-3">'
            + ' <p class="text-show-1">Possible answers</p>'
            + ' </div>'
            + ' <div class="col-4">'
            + ' <div class="container-group listAnswer">'
            + ' <input type="text" class="form-control textValidate2" placeholder="Type your answer">'
            + ' <input type="button" class="input-group-text btn-add-custom addAnswer " value="+"></input>'
            + ' </div>'
            + ' </div>'
            + ' </div>'
            + ' <div class="row">'
            + ' <div class="col-3"></div>'
            + ' <div class="textValidate2Massage ">'
            + ' </div>'
            + ' </div>'
            + ' </div>';

        $('<div class="formQuestionAdd"> <div>' + formQuestionAdd1 + '<div class="process ">' + htmlQuestion2 + '<div><div>').insertAfter($(".formQuestionAdd").eq(lengthQuestion - 1));
        lengthQuestion = document.getElementsByClassName('formQuestionAdd').length;
        console.log(lengthQuestion);
    })

    // check validate for create page
    $("#submit").on('click', function () {
        $('.massage').hide();
        var flag = true;
        var arrayForm = $(".textValidate1");
        var arrayForm2 = $(".textValidate2");
        var arrayFormMassage2 = $(".textValidate2Massage");
        var textNamepoll = $(".textNamepoll")[0];
        var textQuestion = $(".textQuestion");

        $(textNamepoll).css("border-color", "green")
        if (textNamepoll.value.length < 3 || textNamepoll.value.length > 255) {
            $(textNamepoll).css("border-color", "red")
            $(('<div class = " col-5 text-massageNamepool massage" id = "text-massageNamepool">Namepool requires 3 to 255 characters</div>')).insertAfter(textNamepoll);
            $($('#text-massageNamepool')).css("color", "red");
            flag = false;
        }

        $(textQuestion).css("border-color", "green")
        for (let index = 0; index < textQuestion.length; index++) {
            let element = textQuestion[index].value;

            if (element.length < 3 || element.length > 255) {

                $(textQuestion[index]).css("border-color", "red")
                $(('<div class = " col-5 massage  massage text-textQuestion">Question requires 3 to 255 characters</div>')).insertAfter(textQuestion[index]);
                flag = false;
            }

        }
        $(arrayForm).css("border-color", "green")
        for (let index = 0; index < arrayForm.length; index++) {
            let element = arrayForm[index].value;

            if (element.length < 3 || element.length > 255) {
                $(arrayForm[index]).css("border-color", "red");
                $(('<div class="row"><div class = "massage  massageText">Answer requires 3 to 255 characters</div></div>')).insertAfter((arrayForm[index]));
                flag = false;
            }
        }
        $(arrayForm2).css("border-color", "green")
        for (let index = 0; index < arrayFormMassage2.length; index++) {
            let element = arrayForm2[index].value;
            if (element.length < 3 || element.length > 255) {
                $(arrayForm2[index]).css("border-color", "red");
                $(('<div class = " col-5 massage  massageText2">Answer requires 3 to 255 characters</div>')).insertAfter((arrayFormMassage2[index]));
                flag = false;
            }
        }
        $('.massage').css("color", "red");
        $('#text-massageNamepool').css("margin-top", "10px")
        $('.text-textQuestion').css("margin-top", "10px")
        $('.massageText').css("margin-left", "5%");
        $('.massageText2').css("margin-left", "1%");

    })

});