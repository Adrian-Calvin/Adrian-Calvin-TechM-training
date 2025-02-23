document.querySelectorAll(".navbar ul li").forEach(item => {
    item.addEventListener("click", () => {
        const section = document.getElementById(item.innerText.toLowerCase());
        if (section) {
            section.scrollIntoView({ behavior: "smooth" });
        }
    });
});

document.getElementById("enroll-form").addEventListener("submit", function (event) {
    event.preventDefault();
    
    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    
    if (name === "" || email === "") {
        alert("Please fill out all fields.");
    } else {
        alert(`Thank you for enrolling, ${name}!`);
        this.reset();
    }
});
window.addEventListener("scroll", function () {
    const body = document.body;
    if (window.scrollY > 100) { 
        body.classList.add("scrolled");
    } else {
        body.classList.remove("scrolled");
    }
});


