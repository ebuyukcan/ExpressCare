
function initMap(lat, lon) {
//	alert('lat: ' + lat + ', lon: ' + lon);

		var addresspickerMap = $( "#addresspicker_map" ).addresspicker({
			regionBias: "fi",
			mapOptions: {
                  zoom: 13,
/*                  tilt: 45, */
/** Note! Give here the user's stored location! **/
                  center: new google.maps.LatLng(lat, lon),
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
		var gmarker = addresspickerMap.addresspicker("marker");
		gmarker.setVisible(true);
		addresspickerMap.addresspicker( "updatePosition");
}

$(function() {
		
/*		var addresspickerMap = $( "#addresspicker_map" ).addresspicker({
			regionBias: "fi",
			mapOptions: {
                  zoom: 13,*/
/*                  tilt: 45, */
/** Note! Give here the user's stored location! **/
/*                  center: new google.maps.LatLng(48.85823517741984, 2.294511492065453), */
/*                  mapTypeId: google.maps.MapTypeId.ROADMAP,
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
		addresspickerMap.addresspicker( "updatePosition");*/
	
	/** Datepickers **/
	var startAheadHours = 2;
	var endAheadHours = 4;
	
	var now = new Date();
	
	$('#startTime').datetimepicker({
		hour: now.getHours() + startAheadHours,
		firstDay: 1,

	    onClose: function(dateText, inst) {
	        var endDateTextBox = $('#endTime');
	        if (endDateTextBox.val() != '') {
	            var testStartDate = new Date(dateText);
	            var testEndDate = new Date(endDateTextBox.val());
	            if (testStartDate > testEndDate)
	                endDateTextBox.val(dateText);
	        }
	        else {
	            endDateTextBox.val(dateText);
	        }
	    },
	    onSelect: function (selectedDateTime){
	        var start = $(this).datetimepicker('getDate');
	        $('#endTime').datetimepicker('option', 'minDate', new Date(start.getTime()));
	    }
	});
	$('#endTime').datetimepicker({
		hour: (now.getHours() + 4 < 24 ? now.getHours() + endAheadHours : 24 - now.getHours() + endAheadHours),
		firstDay: 1,

	    onClose: function(dateText, inst) {
	        var startDateTextBox = $('#startTime');
	        if (startDateTextBox.val() != '') {
	            var testStartDate = new Date(startDateTextBox.val());
	            var testEndDate = new Date(dateText);
	            if (testStartDate > testEndDate)
	                startDateTextBox.val(dateText);
	        }
	        else {
	            startDateTextBox.val(dateText);
	        }
	    },
	    onSelect: function (selectedDateTime){
	        var end = $(this).datetimepicker('getDate');
	        $('#startTime').datetimepicker('option', 'maxDate', new Date(end.getTime()));
	    }
	});

	var defaultStart = new Date();
	var defaultEnd = new Date();
	defaultStart.setTime(defaultStart.getTime() + startAheadHours*60*60*1000);
	defaultEnd.setTime(defaultEnd.getTime() + endAheadHours*60*60*1000);
	$("#startTime").datetimepicker('setDate', defaultStart);
	$("#endTime").datetimepicker('setDate', defaultEnd);
		
	
/*	$('#startTime').datetimepicker({
		hour: now.getHours() + 2,
		stepMinute: 15,
		
	});
	$('#endTime').datetimepicker({
		hour: now.getHours() + 6,
		stepMinute: 15,
		
	});
	*/	
	});