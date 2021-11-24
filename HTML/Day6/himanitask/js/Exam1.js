
NoOfQuestions = 3;// Edit this value before adding questions 
Questions = Array(NoOfQuestions);
Answers = new Array(NoOfQuestions);
Choosed = false;
for (var i = 0 ; i < NoOfQuestions ; i++)
{
    Answers[i] = new Array(2);
}
CorrectAnswers = new Array(NoOfQuestions);

QuestionNo = 0;
Marks = 0;
OptionChoosed = 0;
Answer = 3;

function loadStep5Review() {

    // Assign values to appropriate cells in review table

    document.getElementById('ReviewFirstName').innerHTML = document.getElementById('FirstName').value;

    document.getElementById('ReviewMiddleName').innerHTML = document.getElementById('MiddleName').value;

    document.getElementById('ReviewLastName').innerHTML = document.getElementById('LastName').value;

    document.getElementById('ReviewQualification').innerHTML = document.getElementById('Qualification').value;

    // Indicate Yes or No based on subscription checkbox checked

    if (document.getElementById('Checkboxht').checked == 1) {

        document.getElementById('Reviewht').innerHTML = 'Yes';

    }

    else {

        document.getElementById('Reviewht').innerHTML = 'No';

    }

    if (document.getElementById('CheckboxJavaScript').checked == 1) {

        document.getElementById('ReviewJavaScript').innerHTML = 'Yes';

    }

    else {

        document.getElementById('ReviewJavaScript').innerHTML = 'No';

    }

    if (document.getElementById('CheckboxCSS').checked == 1) {

        document.getElementById('ReviewCSS').innerHTML = 'Yes';

    }

    else {

        document.getElementById('ReviewCSS').innerHTML = 'No';

    }

    if (document.getElementById('CheckboxPM').checked == 1) {

        document.getElementById('ReviewPM').innerHTML = 'Yes';

    }

    else {

        document.getElementById('ReviewPM').innerHTML = 'No';

    }
    if (document.getElementById('CheckboxScrum').checked == 1) {

        document.getElementById('ReviewScrum').innerHTML = 'Yes';

    }

    else {

        document.getElementById('ReviewScrum').innerHTML = 'No';

    }
    if (document.getElementById('CheckboxTD').checked == 1) {

        document.getElementById('ReviewTD').innerHTML = 'Yes';

    }

    else {

        document.getElementById('ReviewTD').innerHTML = 'No';

    }


}


function AnswerChoosed(Ans)
{
	Answer = Ans;
	Choosed = true;
}

function doValid() {
    var fname = document.getElementById("FirstName").value;
    if (fname == null) {
        document.getElementById("errFirstName").innerHTML = "Please Enter Firstname...";
        return;
    } else {
        document.getElementById("errFirstName").innerHTML = "";
    }
}

function load()
{
    var BG = Math.floor(Math.random() * 3);
    if (BG == 0) { document.body.background = "images/1.png"; }
    else if (BG == 1) { document.body.background = "images/2.png"; }
    else if (BG == 2) { document.body.background = "images/3.png"; }
    else { document.body.background = "images/1.png"; }
	LoadQuestion();
}

function LoadQuestion()
{
  //  alert(QuestionNo);
    var x = document.getElementById("previous");
    document.getElementById("submit").style.display = "none";
    document.getElementById("next").style.display = "inline";
    if (QuestionNo == 0) {
        x.style.display = "none";
    } else {
        x.style.display = "inline";
    }
    if (QuestionNo == 2) {
        document.getElementById("submit").style.display = "inline";
        document.getElementById("next").style.display = "none";
    }
    if (QuestionNo == 3) {
        document.getElementById("submit").style.display = "inline";
        document.getElementById("next").style.display = "none";
    }
    document.getElementById('HeaderTableStep2').style.backgroundColor = 'pink';
	Answer = 3;
}

function PreviousQuestion() {
    QuestionNo--;
    load();
//    alert(document.getElementById('previous').name);
    if (document.getElementById('previous').name == 'Step1') {
        //alert("Hi");
        document.getElementById('next').name = 'Step2';
        document.getElementById('previous').name = 'Step0';
        document.getElementById('Step1').style.display = 'inline';
        document.getElementById('Step2').style.display = 'none';
        document.getElementById('HeaderTableStep2').style.backgroundColor = 'pink';
        document.getElementById('HeaderTableStep3').style.backgroundColor = 'Silver';
    } else if (document.getElementById('previous').name == 'Step2') {
        //alert("Hello");
        document.getElementById('next').name = 'Step3';
        document.getElementById('previous').name = 'Step1';
        document.getElementById('Step2').style.display = 'inline';
        document.getElementById('Step3').style.display = 'none';
        document.getElementById('HeaderTableStep3').style.backgroundColor = 'pink';
        document.getElementById('HeaderTableStep4').style.backgroundColor = 'Silver';
        document.getElementById('HeaderTableStep2').style.backgroundColor = 'Silver';
    } else if (document.getElementById('previous').name == 'Step3') {
        document.getElementById('previous').name = 'Step2';
        document.getElementById('Step3').style.display = 'inline';
        document.getElementById('Step4').style.display = 'none';
        document.getElementById('HeaderTableStep5').style.backgroundColor = 'Silver';
        document.getElementById('HeaderTableStep4').style.backgroundColor = 'pink';
        document.getElementById('HeaderTableStep2').style.backgroundColor = 'Silver';
        document.getElementById('HeaderTableStep1').style.backgroundColor = 'Silver';

    }
}

function NextQuestion()
{
    if (document.getElementById('next').name == 'Step2') {
        var fname = document.getElementById("FirstName").value;
//        alert(fname);
        if (fname == '') {
            document.getElementById("errFirstName").innerHTML = "Please Enter Firstname...";
            return;
        } else {
            document.getElementById("errFirstName").innerHTML = "";
        }
        var lname = document.getElementById("LastName").value;
        if (lname == '') {
            document.getElementById("errLastName").innerHTML = "Please Enter LastName...";
            return;
        } else {
            document.getElementById("errLastName").innerHTML = "";
        }
        QuestionNo++;
        load();
        document.getElementById('next').name = 'Step3';
        document.getElementById('previous').name = 'Step1';
        document.getElementById('Step1').style.display = 'none';
        document.getElementById('Step2').style.display = 'inline';
        document.getElementById('HeaderTableStep3').style.backgroundColor = 'pink';
        document.getElementById('HeaderTableStep2').style.backgroundColor = 'Silver';
    } else if (document.getElementById('next').name == "Step3") {
        QuestionNo++;
        load();
        document.getElementById('next').name = 'Step4';
        document.getElementById('previous').name = 'Step2';
        document.getElementById('Step2').style.display = 'none';
        document.getElementById('Step3').style.display = 'inline';
        document.getElementById('HeaderTableStep4').style.backgroundColor = 'pink';
        document.getElementById('HeaderTableStep3').style.backgroundColor = 'Silver';
        document.getElementById('HeaderTableStep2').style.backgroundColor = 'Silver';
    }
    else if (document.getElementById('next').name == "Step4") {
        QuestionNo++;
        load();

        document.getElementById('previous').name = 'Step3';
        document.getElementById('Step3').style.display = 'none';
        document.getElementById('Step4').style.display = 'none';
        document.getElementById('HeaderTableStep3').style.backgroundColor = 'pink';
        document.getElementById('HeaderTableStep2').style.backgroundColor = 'Silver';
        document.getElementById('HeaderTableStep1').style.backgroundColor = 'Silver';
    }
}

function ShowSummary() {
    load();
    QuestionNo++;
    document.getElementById('HeaderTableStep4').style.backgroundColor = 'Silver';
    document.getElementById('HeaderTableStep5').style.backgroundColor = 'pink';
    document.getElementById('HeaderTableStep2').style.backgroundColor = 'Silver';
    document.getElementById('Step3').style.display = 'none';
    document.getElementById('Step4').style.display = 'inline';
    document.getElementById("previous").style.display = "inline";
    document.getElementById("submit").style.display = "none";
    document.getElementById('previous').name = 'Step3';
    loadStep5Review();
}