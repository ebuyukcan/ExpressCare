
$(function() {
		
		var addresspickerMap = $( "#addresspicker_map" ).addresspicker({
			regionBias: "fi",
		  elements: {
		    map:      "#map",
		    lat:      "#lat",
		    lng:      "#lng",
		    locality: '#locality',
		    country:  '#country'
		  }
		});
		var gmarker = addresspickerMap.addresspicker( "marker");
		gmarker.setVisible(true);
		addresspickerMap.addresspicker( "updatePosition");
	
	/** Datepickers **/
	$('#startTime').datetimepicker();
	$('#endTime').datetimepicker();
		
	});