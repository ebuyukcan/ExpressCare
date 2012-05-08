
$(function() {
		
		var addresspickerMap = $( "#addresspicker_map" ).addresspicker({
			regionBias: "fi",
			mapOptions: {
                  zoom: 13,
/*                  tilt: 45, */
/** Note! Give here the user's stored location! **/
/*                  center: new google.maps.LatLng(48.85823517741984, 2.294511492065453), */
                  mapTypeId: google.maps.MapTypeId.ROADMAP,
                  streetViewControl: false,
                  panControl: false
            },
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