console.log("loaded.. script.js")

//change theme function
const changeTheme = (currentTheme) => {
    // set to webpage
    document.querySelector('html').classList.add(currentTheme);
    
    // listener 
    const themebtn = document.querySelector("#change_theme_btn");
    //console.log("theme btn = "+ themebtn);
    themebtn.addEventListener("click", () =>{
        console.log("change theme button clicked");
        changeTheme(currentTheme === "light" ? "dark" : "light");
        setTheme(currentTheme);
    })
}


// function to store current theme into local storage
const setTheme = (Theme) =>{
    localStorage.setItem("theme", Theme);
    console.log("saved current theme to local storage: +"+currentTheme);
}


// function to fetch saved theme from local storage
const getTheme = () =>{
    let myTheme =  localStorage.getItem("theme");
    if(myTheme === null){
        myTheme = "light";
    }
    return myTheme;
}

let currentTheme = getTheme();









