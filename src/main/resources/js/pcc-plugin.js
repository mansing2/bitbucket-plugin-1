alert("I am an alert box!");

console.log("Start of Plugin");

AJS.$("#dialog-show-button").click(function(e) {
    e.preventDefault();
    AJS.dialog2("#demo-dialog").show();
});

// Hides the dialog
AJS.$("#dialog-submit-button").click(function (e) {
    e.preventDefault();
    AJS.dialog2("#demo-dialog").hide();
});