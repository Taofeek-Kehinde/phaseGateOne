//START
//We are to create system like facebook that detects when a user like a post
//we are to create a text that displayed the names of people if there is no user we have to return no user
//if there is user we have to get the lenght of the users and to get that we need array to store the user and index to point to the user
//END
function likes(names) {

    let number = names.length; 
    if (number == 0) 
    return "no one likes this";
    if (number == 1) 
    return `${names[0]} likes this`;
    if (number == 2) 
    return `${names[0]} and ${names[1]} like this`;
    if (number == 3)
    return `${names[0]}, ${names[1]} and ${names[2]} like this`;
    return `${names[0]}, ${names[1]} and ${names[2]} and ${names[3]} others like this`;
}
console.log(likes([])); 
console.log(likes(["Peter"]));  
console.log(likes(["Jacob", "Alex"]));  
console.log(likes(["Max", "John", "Mark"]));  
console.log(likes(["Alex", "Jacob", "Mark", "Max"]));
