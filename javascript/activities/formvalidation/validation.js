function validate() {
    // Validate name input
    if (document.myForm.Name.value == "") {
        alert("Please provide your name!");
        document.myForm.Name.focus();

        return false;
    } else {
        var name = document.getElementById("nameid").value;
    }

    // Validate the email input
    if (document.myForm.Email.value == "") {
        alert("Please provide your email!");
        document.myForm.Email.focus();

        return false;
    }

    if (document.myForm.Email.value != "") {
        if (validateEmail()) {
            var emailValue = document.getElementById("emailId").value;
        }
    }

    // Validate the zipcode input
    if (document.myForm.Zip.value == "" || isNaN(document.myForm.Zip.value) || document.myForm.Zip.length != 5) {
        alert("Please provide a zipcode in the format #####.");
        document.myForm.Zip.focus();

        return false;
    } else {
        var zip = document.getElementById("zipId").value;
    }

    // Validate the country from the dropdown selection
    if (document.myForm.countryId.value == "-1") {
        alert("Please provide your country!");

        return false;
    } else {
        var country = document.getElementById("countryId").value;
    }

    // Validate password
    if (document.myForm.Password.value == "") {
        alert("Please provide your password!");
        document.myForm.Password.focus();

        return false;
    } else {
        var password = document.getElementById("passwordId").value;

        // Each input is validated at this point, confirm with an alert
        alert("Name: " + name + ", Password: " + password + ", Email: " + email + ", Country: " + country + ", Zip Code: " + zip);

        return true;
    }
}