$(document).ready(function(){
	
	var naziv=$("#naziv").val();

	
	
	$.ajax({
		type:"GET",
		url:"http://localhost:8080/api/restorani/naziv" + this.naziv,
		dataType:"json",
		success:function(data){
			console.log("SUCCESS:",data);
			for(i=0;i<data.length;i++){
				var row="<tr>";
				row+="<td>"+data[i]['naziv']+"</td>";
				row+="<td>"+data[i]['tip_restorana']+"</td>"
				row+="<td>"+data[i]['lokacija']+"</td>";
				row+="<td>"+data[i]['status']+"</td>";
				
				
				
	             
	             $('#PregledRestorana').append(row);

			}
		},
		error:function(data){
			console.log("ERROR:",data);
		}
	});
});





	
