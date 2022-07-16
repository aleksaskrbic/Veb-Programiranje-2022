$(document).ready(function(){
    $("#pretrazeno").hide();
});


$(document).on("submit","form",function(event){
	event.preventDefault();
	$(".container").hide();
	var naziv=$("#naziv").val();
	var tip_restorana=$("#tip_restorana").val();
	var status=$("#status").val();
	var lokacija=$("#lokacija").val();

	var newKorisnikJSON=formToJSON(naziv,tip_restorana,status,lokacija);
	
	
	$.ajax({
		type:"GET",
		url:"http://localhost:8080/api/restorani/naziv/" + this.naziv,
		dataType:"json",
		contentType:"application/json",
		data:newKorisnikJSON,
		success:function(data){
			for(i=0;i<data.length;i++){
				var row="<tr>";
				row+="<td>"+data[i]['naziv']+"</td>";
				row+="<td>"+data[i]['tip_restorana']+"</td>"
				row+="<td>"+data[i]['status']+"</td>";
				row+="<td>"+data[i]['lokacija']+"</td>";
				
				
	              row+="</tr>";
	             row+="<br>";
	             
	             $("#pretrazeno").show();
	             $('#pretrazeno').append(row);
	             window.location.href="pretraga.html";

			}
			
		},
		error:function(data){
            $('#pretrazeno').append(row);

			alert("Nema pronadjenih restorana!");
			window.location.href="pretraga.html";
		}
	});
	
});

//pomocna funkcija koja od polja praavi JSON
function formToJSON(naziv,tip_restorana,status,lokacija){
	return JSON.stringify({
		"naziv":naziv,
		"tip_restorana,":tip_restorana,
		"status":status,
		"lokacija":lokacija
		
	});
}
	