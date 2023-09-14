     
    let me = function(){
    console.log("kesan baa! babua");
    }
    me();
    //ANONYMOUS FUNTION
    
    //without parameter and without return type
    console.log("without parameter and without return type")
    let temp2 = function (){
          console.log(4-2)
    }
    temp2()
    
    //with parameter and without return type
    console.log("with parameter and without return type")
    let temp3 = function ( a:number, b:number){
        console.log(a-b)
    }
    temp3(5,2)
    
    //without parameter and with return type
    console.log("without parameter and with return type")
    let temp4 = function ():number{
        return(4-2)
    }
    let res = temp4()
    console.log(res)
    
    //with parameter and with return type
    console.log("with parameter and with return type")
    let temp5 =function (x:number, y:number):number{
        return(x-y)
    }
    console.log(temp5(4,8))
    //FAT ARROW FUNCTION
    console.log("Fat Arrow")
    //without parameter and without return type
    console.log("without parameter and without return type")
    let temp6 =  ()=>{
          console.log(4-2)
    }
    temp6()
    
    //with parameter and without return type
    console.log("with parameter and without return type")
    let temp7 =  ( a:number, b:number)=>{
        console.log(a-b)
    }
    temp7(5,2)
    
    //without parameter and with return type
    console.log("without parameter and with return type")
    let temp8 =  ():number=>{
        return(4-2)
    }
    let res1 = temp8()
    console.log(res1)
    
    //with parameter and with return type
    console.log("with parameter and with return type")
    let temp9 = (x:number, y:number):number=>{
        return(x-y)
    }
    console.log(temp9(4,8))