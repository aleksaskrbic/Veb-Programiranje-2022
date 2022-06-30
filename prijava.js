$(document).on("submit","form",function(event){
	event.preventDefault();
	

	
	
	var username=$("#username").val();
	var lozinka=$("#lozinka").val();
	
	var newKorisnikJSON=formToJSON(username,lozinka);
	
	
	
	$.ajax({
		type:"POST",
		url:"http://localhost:8080/api/login",
		dataType:"json",
		contentType:"application/json",
        data: JSON.stringify({"username":  $('#username').val(), "lozinka": $('#lozinka').val()}),
		//data:newKorisnikJSON,

		success:function(data){
			console.log("SUCCESS: ",data);
			alert(username + " je uspesno uspeo da se prijavi");
			window.location.href="index.html";
			
		},
		error:function(data){
			console.log("ERROR: ",data);
			alert(username);
			window.location.href="index.html";
		}
	});
	
});

function formToJSON(username,lozinka){
	return JSON.stringify({
		"username":username,
		"lozinka":lozinka
		
	});
}





















