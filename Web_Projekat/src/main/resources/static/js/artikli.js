$(document).ready(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost:8080/api/artikli",
		dataType:"json",
		success:function(data){
			console.log("SUCCESS:",data);
			for(i=0;i<data.length;i++){
				var row="<tr>";
				row+="<td>"+data[i]['naziv']+"</td>";
				row+="<td>"+data[i]['tip_hrane']+"</td>"
				row+="<td>"+data[i]['kolicina']+"</td>";
				row+="<td>"+data[i]['opis']+"</td>";
				row+="<td>"+data[i]['cena']+"</td>";
				
				
				var btn = "<button class='delete' id = " + data[i]['id'] + ">Obrisi</button>";
				row += "<td>" + btn + "</td>";
				
				
	             
	             $('#artikli').append(row);

			}
		},
		error:function(data){
			console.log("ERROR:",data);
		}
	});
});


$(document).on('click', '.delete', function () {       
    

	 
    $.ajax({
        type: "DELETE",
        url: "http://localhost:8080/api/artikal/delete/" + this.id,  
        dataType: "json",
        success: function (data) {
        	console.log("SUCCESS : ", data);
        	alert("Artikal je uspesno obrisan!");
        	//location.reload(true);
        	
                           
        	window.location.href="svi_artikli.html";
        },
        error: function (data) {
        	alert("Artikal je uspesno obrisan!");
        	window.location.href="svi_restorani.html";

            
        }
    });
});


