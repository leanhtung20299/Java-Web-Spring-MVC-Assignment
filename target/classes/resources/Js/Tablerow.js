$(document).ready(function () {
    // initialize the value in the table
    // an array containing object values
    var listQuestion = [];
    listQuestion.push(new Question(91, 'Question 1'));
    listQuestion.push(new Question(92, 'Question 2'));
    listQuestion.push(new Question(93, 'Question 3'));
    listQuestion.push(new Question(94, 'Question 4'));
    listQuestion.push(new Question(95, 'Question 5'));
    listQuestion.push(new Question(96, 'Question 6'));
    listQuestion.push(new Question(97, 'Question 7'));
    listQuestion.push(new Question(98, 'Question 8'));

    // pass value to column in table with the line of code below 
    listQuestion.forEach(question => {
        $("tbody").append(question.getDataRow);
    });

    // instantiate an object Question , with two value fields id and question 
    // a property is the getDatarow method to get the html value displayed in the table
    function Question(id, question) {
        this.id = id;
        this.question = question;
        this.getDataRow =
            '<tr class="tableRow">'
            + '<td scope="row">' + this.id + '</td>'
            + '<td>' + this.question + '</td>'
            + '<td>'
            + '<row>'
            + '<input  class="btn-delete" type="button" value="View results">'
            + '<input  class="btn-delete" type="button" value="Close poll">'
            + '<input  class="deleleRow btn-delete" type="button" value="Delete" >'
            + '</row>'
            + '</td>'
            + '</tr>';
    };

    // event handler with row delete function
    $('.deleleRow').unbind().click(function () {
        // Show confirm box 
        if (confirm("Are you want sure to delete this item?") == true) {

            // using the prototype chain array to get the index value in the class
            let rowDelete = Array.prototype.slice.call($('.deleleRow'));
            let index = rowDelete.indexOf(this);
            alert(index);

            // calling Ajax form 
            $.ajax({
                type: "delete",
                url: "url",
                data: {
                    "idQuestion": index
                },
                dataType: "dataType",
                success: function (response) {
                    // nope webservice ạ :((
                }
            });
            // delete row 
            if ($($('.tableRow')[index]).remove() == true)
                return;
        }
    });

});
