form = function(name){
	var json = $(name).serializeArray();
	var newjson="{";
	$.each(json, function(i,n) {
		 newjson += "\""+n.name+"\":"+"\""+n.value+"\",";
	});
	newjson = newjson.substr(0,newjson.length-1);
	newjson+="}";
	return newjson;
}
