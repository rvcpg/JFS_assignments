class person   {
    constructor(fname,lname,age,skills,dateofbirth,address,married,profession)
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.skills=skills;
        this.dateofbirth=dateofbirth;
        this.address=address; 
        this.married=married;
        this.profession=profession;
    
    }
}

var person1=new 
person("Ravi","Kumar",21,["c"],"29/10/2000","chennai","false","analyst")
var person2=new 
person("Ravi","Verma",21,"HTML","29/10/2000","Purnia","false","analyst");

function print(per){
    console.log("fname : "+per.fname);
    console.log("lname : "+per.lname);
    console.log("age : "+per.age);
    console.log("skills : "+per.skills);
    console.log("DOB : "+per.dateofbirth);
    console.log("address : "+per.address);
    console.log("Married : "+per.married);
    console.log("Professions : "+per.profession)
}

console.log(person1);
console.log(person2);
print(person1);
print(person2);