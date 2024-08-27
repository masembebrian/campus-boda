// js/app.js

function showRideBookingForm() {
    alert("Ride booking form will be shown here.");
}

function showLoginModal() {
    document.getElementById("login-modal").style.display = "block";
}

function closeLoginModal() {
    document.getElementById("login-modal").style.display = "none";
}

function showWalletModal() {
    document.getElementById("wallet-modal").style.display = "block";
}

function closeWalletModal() {
    document.getElementById("wallet-modal").style.display = "none";
}

window.onclick = function(event) {
    if (event.target == document.getElementById("login-modal")) {
        closeLoginModal();
    }
    if (event.target == document.getElementById("wallet-modal")) {
        closeWalletModal();
    }
}
