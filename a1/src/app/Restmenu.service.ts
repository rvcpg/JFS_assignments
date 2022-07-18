import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestmenuService {


  rm :any = new Map<any,string[]>();

getRestmenu() {
  return this.rm;
}
setRestmenu(rm:any) {
  this.rm = rm;
}
setrest(r:any){
  this.rm.set(r,[]);
}
deleteRest(item: any) {
  this.rm.delete(item);
}

constructor() {
  this.rm.set("🍴Shivansh's Restaurant🍴",["Biryani"," Paneer butter masala"," Tandoori chicken"," Omlette"," Pizza"," Sandwich"]);
  this.rm.set("🍴Sourav's Restaurant🍴",["Chicken tikka"," Tandoori chicken"," Butter Naan"," Aloo paratha"," Chicken 65"," Rumali roti"]);
  this.rm.set("🍴Ravi's Restaurant🍴",["Litti chokha"," Dahi Chura"," Chicken Biryani"," Bari Bhaat"," Machli Bhaat"," Sattu Paratha & Chokha"])
 }
}


