class account {
    id: number;
    name: string;
    balance: number;
    constructor(id: number, name: string, balance: number){
        this.id = id,
        this.name = name,
        this.balance = balance
    }
    getId(){
        return this.id;
    }
    getbalace(){
        return this.balance;
    }
    getname(){
        return this.name;
    }
}

class savaingAccount extends account{
    interest = 5;
    cash_credit = 0;

    setInterest(interest: number){
        this.interest = interest;
    }
    
    setCashCredit(credit: number){
        this.cash_credit = credit;
    }
}

class currentAccount extends account{
    interest = 5;
    cash_credit = 0;

    setInterest(interest: number){
        this.interest = interest;
    }
    
    setCashCredit(credit: number){
        this.cash_credit = credit;
    }
}

let obj1 = new savaingAccount(123, "ravi", 100);
let obj2 = new savaingAccount(124, "ravi1", 1000);
let obj3 = new savaingAccount(122, "ravi2", 200);
let obj4 = new currentAccount(127, "ravi3", 2002);

let arr = [obj1, obj2, obj3, obj4];

let sum = 0;
for(let a of arr){
    sum = sum + a.getbalace();
}

console.log(sum);