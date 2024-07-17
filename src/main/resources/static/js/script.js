console.log("loaded.. script")

//change theme function
const changeTheme = (currentTheme) => {
    // set to webpage
    document.querySelector('html').classList.add(currentTheme);
    
    // listener 
    const themebtn = document.querySelector("#change_theme_btn");
    themebtn.addEventListener("click", () =>{
        console.log("change theme button clicked");
        let toggle = currentTheme;
        if(toggle === "light"){
            toggle = "dark";
        }else{
            toggle = "light";
        }
        changeTheme(toggle);
        document.querySelector('html').classList.remove(currentTheme);
        setTheme(toggle);
    })
}


// function to store current theme into local storage
const setTheme = (Theme) =>{
    localStorage.setItem("theme", Theme);
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

changeTheme(currentTheme);









