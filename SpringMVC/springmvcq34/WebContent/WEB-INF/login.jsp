
<html>   
<head>  
<title> Login Page </title>  
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: black;  
} 

h1 {
    color:white;
    text-align: center;
   }

button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: white;   
        padding: 15px;   
        margin: 10px 0px;   
        border: 2px solid green;   
        cursor: pointer;   
         }   
 
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>    
<body>    
    <h1> Login Form </h1>   
    <form action="/springmvcq34/Submit" method="post">  
        <div class="container">   
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="name" required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="pass" required> <br> 
            <center> <button type="submit">SUBMIT</button> </center>
        </div>   
    </form>     
</body>     
</html>  