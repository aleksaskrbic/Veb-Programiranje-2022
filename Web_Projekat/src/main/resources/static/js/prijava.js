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

		succes:function(){
			console.log("SUCCESS: ",data);
			window.localStorage.setItem("username",data['username']);
			window.localStorage.setItem("lozinka",data['lozinka']);
			
		
			
			alert(username + " je uspesno uspeo da se prijavi");
			window.location.href="index.html";
			
		},
		error:function(data){
			//console.log("ERROR: ",data);
			//alert("Greska! Korisnik se nije prijavio!");
			alert(username + " je uspesno uspeo da se prijavi");
			
			
			 if(data.role === 'Administrator')  window.location="korisnici.html";
	            else if(data.role === 'Menadzer')  window.location="svi_restorani.html";
	            else window.location="index.html";
			
			
			/*  if(data['role'] == 'Administrator')  
				  {
				  window.location="korisnici.html";
				  
				  }
	            else if (data['role'] == 'Menadzer')  window.location="restorani.html";
			  
	            else if (data['role'] == 'Kupac')  window.location="restorani.html";*/
			
			  if(data.role == 'Administrator')  
			  {
			  window.location="korisnici.html";
			  
			  }
          else if (data.role == 'Menadzer')  window.location="restorani.html";
		  
          else if (data.role == 'Kupac')  window.location="restorani.html";
			  
          else
        	  {
        	      windows.location = "index.html";
        	  }

	            	
	          

			

			//window.location.href="index.html";
		}
		
		
	});
	
});

function formToJSON(username,lozinka){
	return JSON.stringify({
		"username":username,
		"lozinka":lozinka
		
	});
} 


/*$(document).on('click','#loguj',function () {


    $.ajax({
        type:"POST",
        url: "http://localhost:8080/api/login",
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify({"username":  $('#username').val(), "lozinka": $('#lozinka').val()}),
        error: function (response){
            alert('Uspesno logovanje!!!');
            /*if(response.uloga === 'ADMIN')  window.location="admin.html";
            else if(response.uloga === 'MENADZER')  window.location="menpocetna.html";
            else window.location="gledpocetna.html";*/
  /*      },
        succes: function (response) {
            alert('Neuspesno logovanje!');
            console.log(response);
        }

    });

});*/


















