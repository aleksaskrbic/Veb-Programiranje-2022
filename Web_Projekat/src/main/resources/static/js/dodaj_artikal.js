$(document).on("submit","form",function(event){
	event.preventDefault();
	
	var naziv=$("#naziv").val();
	var tip_hrane=$("#tip_hrane").val();
	var opis=$("#opis").val();
	var cena=$("#cena").val();
	var kolicina=$("#kolicina").val();
	var restoran_ID = $("#restoran_ID").val();
	
	
	var newKorisnikJSON=formToJSON(naziv,tip_hrane,opis,cena, kolicina, restoran_ID);
	
	$.ajax({
		type:"POST",
		url:"http://localhost:8080/api/artikal/create",
		dataType:"json",
		contentType:"application/json",
		data:newKorisnikJSON,
		success:function(){
			alert("Novi artikal je uspesno dodat!");
			window.location.href="svi_artikli.html";
		},
		error:function(){
			alert("Novi artikal je uspesno dodat.");
			window.location.href="svi_artikli.html";
		}
	});
	
});

//pomocna funkcija koja od polja praavi JSON
function formToJSON(naziv,tip_hrane,opis,cena,kolicina, restoran_ID){
	return JSON.stringify({
		"naziv":naziv,
		"tip_hrane":tip_hrane,
		"opis":opis,
		"cena": cena,
		"kolicina": kolicina,
		"restoran_ID": restoran_ID
	});
}