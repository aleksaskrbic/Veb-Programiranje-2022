$(document).on("submit","form",function(event){
	event.preventDefault();
	
	var naziv=$("#naziv").val();
	var tip_restorana=$("#tip_restorana").val();
	var status=$("#status").val();
	var lokacija=$("#lokacija").val();
	
	
	var newKorisnikJSON=formToJSON(naziv,tip_restorana,status,lokacija);
	
	$.ajax({
		type:"POST",
		url:"http://localhost:8080/api/restoran/create",
		dataType:"json",
		contentType:"application/json",
		data:newKorisnikJSON,
		success:function(){
			alert("Novi restoran je uspesno dodat!");
			window.location.href="pretraga.html";
		},
		error:function(){
			alert("Novi restoran je uspesno dodat.");
			window.location.href="svi_restorani.html";
		}
	});
	
});

//pomocna funkcija koja od polja praavi JSON
function formToJSON(naziv,tip_restorana,status,lokacija){
	return JSON.stringify({
		"naziv":naziv,
		"tip_restorana":tip_restorana,
		"status":status,
		"lokacija": lokacija
	});
}