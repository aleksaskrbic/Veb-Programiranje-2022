$(document).on("submit","form",function(event){
	event.preventDefault();
	
	var username=$("#username").val();
	var lozinka=$("#lozinka").val();
	var ime=$("#ime").val();
	var prezime=$("#prezime").val();
	var pol=$("#pol").val();
	var datum_rodjenja=$("#datum_rodjenja").val();
	var role = $("role").val();
	
	
	
	var newKorisnikJSON=formToJSON(username,lozinka,ime,prezime,pol,datum_rodjenja,role);
	
	
	$.ajax({
		type:"POST",
		url:"http://localhost:8080/api/registracija",
		dataType:"json",
		contentType:"application/json",
		//data:newKorisnikJSON,
		data: JSON.stringify({"username":$('#username').val(),"lozinka":$('#lozinka').val(),"ime": $('#ime').val(),
              "prezime":$('#prezime').val(), "pol":$('#pol').val(),"datum_rodjenja":$('#datum_rodjenja').val(), "role":$('#role').val() }),
		
	/*	data: JSON.stringify({"username":$("#username").val(),"lozinka":$("#lozinka").val(),"ime":$("#ime").val(),
            "prezime":$("#prezime").val(), "pol":$("#pol").val(),"datum_rodjenja":$("#datum_rodjenja").val()}),*/
		
		success:function(){
			alert(ime+" "+prezime+" je uspesno registrovan!");
			//window.location.href="index.html"; 
		},
		error:function(){
			alert(ime+" "+prezime+" je uspesno registrovan!!");
			//window.location.href="index.html"; 
		}
	});
	
});

//pomocna funkcija koja od polja praavi JSON
function formToJSON(username,lozinka,ime,prezime,pol,datum_rodjenja,role){
	return JSON.stringify({
		"username":username,
		"lozinka,":lozinka,
		"ime":ime,
		"prezime":prezime,
		"pol":pol,
		"datum_rodjenja":datum_rodjenja,
		"role": role
		
	});
}





