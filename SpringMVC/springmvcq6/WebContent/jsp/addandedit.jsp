
<html>
<head>
<title>Form Page</title>
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

.error {
	color: red
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
	<h1>Form</h1>
	<form action="/springmvcq5/mani" method="post">

		<div class="container">
			<table class="center">
				<tr>
					<td><form:errors path="" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Name :</td>

					<td><input type="text" placeholder="Enter Employee Name"
						name="username"></td>
					
					<td>Password :</td>
					<td><input type="text" placeholder="Enter Employee Password"
						name="password"></td>

				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="text"
						placeholder="Enter Employee  Department" name="email">
					</td>

					<td>Contact :</td>
					<td><input type="text"
						placeholder="Enter Employee Designation" name="contact">
					</td>

				</tr>
				<tr>

					<td>City :</td>
					<td><select name="city" size="1"
						onchange="makeSubmenu(this.value)">
							<option value="" selected="selected">Choose City</option>
							<option value="O">O</option>
							<option value="M">M</option>
							<option value="K">K</option>
					</select></td>
					<td>Zipcode :</td>
					<td><input type="text" placeholder="Enter Employee Salary"
						name="zip"></td>

					
				</tr>
				<td><center>
							<button type="submit">SUBMIT</button>
						</center></td>


			</table>

		</div>
	</form>
</body>
</html>
