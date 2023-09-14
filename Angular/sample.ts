//Display Class Data Using Advanced Feature of typescript

export class User{
    UserId:number;
      UserName:string;
      UserAge:string;
  
      constructor(UserId:number,UserName:string,UserAge:string){
  
          this.UserId=UserId;
          this.UserName=UserName;
          this.UserAge=UserAge;
  
      }
     
      public display(){
          console.log(`
              User Id            ::${this.UserId}
              User Name          ::${this.UserName}
              User Age           ::${this.UserAge}
          `)
      }
  
  }
  
  
  export function displayUserDetails(){
      console.log("user info is")
      
  }