
<html>   
<head>  
<title> Success Page </title>  
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: black;  
} 

h1 {   
       background-color: #4CAF50;   
       width: 100%;  
        color: white;   
        padding: 15px;   
        margin: 10px 0px;   
        border: 2px solid green;   
        cursor: pointer; 
        text-align: center;  
         }   
 
 form {   
        border: 3px solid #f1f1f1;   
    }   

 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>    
<body>    
    <h1> SUCCESS </h1>   
    <form action="/springmvcq3/Submit" method="POST">  
        <div class="container">   
	           <table>
					<tr>
						<td>UserName:</td>
						<td>${si.name}</td>
					</tr>
					<tr>
						<td>Password:</td>
						<td>${si.pass}</td>
					</tr>
			   </table>
		 </div>   
    </form>     
</body>     
</html>  