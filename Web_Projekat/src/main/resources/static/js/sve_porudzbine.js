/*$(document).ready(function(){
	$.ajax({
		type:"GET",
		url:"http://localhost:8080/api/porudzbine",
		dataType:"json",
		success:function(data){
			console.log("SUCCESS:",data);
			for(i=0;i<data.length;i++){
				var row="<tr>";
				row+="<td>"+data[i]['cena']+"</td>";
				row+="<td>"+data[i]['datum_i_vreme']+"</td>"
				row+="<td>"+data[i]['status']+"</td>";
				row+="<td>"+data[i]['dostavljac_id']+"</td>";
				row+="<td>"+data[i]['kupac_id']+"</td>";
				row+="<td>"+data[i]['restoran_id']+"</td>";
				
				
				
	             
	             $('#porudzbine.html').append(row);

			}
		},
		error:function(data){
			console.log("ERROR:",data);
		}
	});
});*/

