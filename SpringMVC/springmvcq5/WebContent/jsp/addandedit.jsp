
<html>
<head>
<title>${bingo}Page</title>
<style>
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: black;
}

h1 {
	color: white;
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
	width: 45%;
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

.center {
	margin-left: auto;
	margin-right: auto;
	border: 5px solid green;
	width: 90%;
	font-size: 20px;
	background-color: black;
	color: white;
}
</style>
</head>
<body>
	<h1>${bingo} table</h1>
	<form action="/springmvcq5/mani2/${bingo}/${id}" method="post">
		<div class="container">
			<table class="center">
				<tr>
					<td>Name :</td>

					<td><input type="text" placeholder="Enter Employee Name"
						name="ename"></td>
					<td>ID :</td>
					<td><input type="text" placeholder="Enter Employee Id"
						name="eid" ></td>
				</tr>
				<tr>
					<td>Department :</td>
					<td><input type="text"
						placeholder="Enter Employee  Department" name="edepartment">
					</td>
					<td>Designation :</td>
					<td><input type="text"
						placeholder="Enter Employee Designation" name="edesignation" >
					</td>
				</tr>
				<tr>
					<td>Salary :</td>
					<td><input type="text" placeholder="Enter Employee Salary"
						name="esalary" ></td>
					<td><center>
							<button type="submit">${bingo}</button>
						</center></td>
				</tr>


			</table>

		</div>
	</form>
</body>
</html>
