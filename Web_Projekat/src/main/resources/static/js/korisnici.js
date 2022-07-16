$(document).ready(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost:8080/api/korisnici",
		dataType:"json",
		success:function(data){
			console.log("SUCCESS:",data);
			for(i=0;i<data.length;i++){
				var row="<tr>";
				row+="<td>"+data[i]['username']+"</td>";
				row+="<td>"+data[i]['ime']+"</td>"
				row+="<td>"+data[i]['prezime']+"</td>";
				row+="<td>"+data[i]['pol']+"</td>";
				row+="<td>"+data[i]['datum_rodjenja']+"</td>";
				row+="<td>"+data[i]['role']+"</td>";
				
				
				var izmena = "<button class='izmeniKorisnika' id = " + data[i]['id'] + ">Izmeni</button>";
	              row += "<td>" + izmena + "</td>"; 
	              row+="</tr>";
	             row+="<br>";
				
				
	             
	             $('#korisnici').append(row);

			}
		},
		error:function(data){
			console.log("ERROR:",data);
		}
	});
});


$(document).on('click', '.izmeniKorisnika', function () {       
    
	 
  $.ajax({
      type: "GET",
      url: "http://localhost:8080/api/korisnici/" + this.id,  
      dataType: "json",
      success: function (data) {
      	console.log("SUCCESS : ", data);
      	var row="<label for='id'><b>id</b></label><input type='text'   id='id'  value="+data['id']+"  disabled='disabled'>"+"<label for='ime'><b>Ime</b></label><input type='text'   id='kapacitet' value="+data['ime']+">" +
      	"<label for='prezime'><b>Prezime</b></label><input type='text'   id='prezime'  value="+data['oznaka']+">";
      	row+="<button type='submit' class='izmena'>Izmeni Korisnika</button>";
  
      	//$('#naslov').hide();
      	 $('#korisnici').append(row);
      	//$('#pregledSala').hide();
      },
      error: function (data) {
      	alert("Doslo je do greske");
          console.log("ERROR : ", data);
      }
  });
});





//Izmeni korisnisa
$(document).on('click', '.izmena', function () {       
    
	var id=$("#id").val();
	var ime=$("#ime").val();
	var prezime=$("#prezime").val();



	var newKorisnikJSON=formToJSON2(id,ime,prezime);

	$.ajax({
		type:"PUT",
		url:"http://localhost:8080//api/korisnik/edit",
		dataType:"json",
		contentType:"application/json",
		data:newKorisnikJSON,
		success:function(){
			alert("Podaci o korisniku su uspesno izmenjeni!");
			//window.location.href="index.html";
		},
		error:function(){
			//alert("Greska! Pokušajte ponovo.");
			alert("Nova sala je uspesno izmenjena!");

		}
	});

	});

function formToJSON2(id,ime,prezime){
	return JSON.stringify({
		"id":id,
		"ime":ime,
		"prezime":prezime
		
	});
}



