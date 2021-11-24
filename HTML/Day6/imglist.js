
(function () {

    function load() {
        var BG = Math.floor(Math.random() * 3);
        if (BG == 0) { document.body.background = "1.jpg"; }
        else if (BG == 1) { document.body.background = "2.jpg"; }
        else if (BG == 2) { document.body.background = "3.jpg"; }
        else { document.body.background = "4.jpg"; }
    }

    const quizContainer = document.getElementById("quiz");
    const resultsContainer = document.getElementById("results");
    const submitButton = document.getElementById("submit");

    // display quiz right away
    buildQuiz();

    const previousButton = document.getElementById("previous");
    const nextButton = document.getElementById("next");
    const slides = document.querySelectorAll(".slide");
    let currentSlide = 0;

    showSlide(0);

    // on submit, show results
    submitButton.addEventListener("click", showResults);
    previousButton.addEventListener("click", showPreviousSlide);
    nextButton.addEventListener("click", showNextSlide);
})();

