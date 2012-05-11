function initMap(lat, lon) {
		var addresspickerMap = $( "#addresspicker_map" ).addresspicker({
			regionBias: "fi",
			mapOptions: {
                  zoom: 13,
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
	
	/** Datepickers **/
	var startAheadHours = 24;
	var endAheadHours = 28;
	
	var now = new Date();
	
	$('#startTime').datetimepicker({
		hour: now.getHours() + startAheadHours,
		firstDay: 1,
		stepMinute: 15,

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
	        updateHoursAndPrice();
	    }
	});
	$('#endTime').datetimepicker({
		hour: (now.getHours() + 4 < 24 ? now.getHours() + endAheadHours : 24 - now.getHours() + endAheadHours),
		firstDay: 1,
		stepMinute: 15,

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
	        updateHoursAndPrice();
	    }
	});

	var defaultStart = new Date();
	var defaultEnd = new Date();
	defaultStart.setTime(defaultStart.getTime() + startAheadHours*60*60*1000);
	defaultEnd.setTime(defaultEnd.getTime() + endAheadHours*60*60*1000);
	$("#startTime").datetimepicker('setDate', defaultStart);
	$("#endTime").datetimepicker('setDate', defaultEnd);
	
	updateHoursAndPrice();
});


function updateHoursAndPrice() {
	var baseprice = 13;
	$('#hourly_price').html(baseprice);

	var startDate = $('#startTime').datetimepicker('getDate');
	var endDate = $('#endTime').datetimepicker('getDate');
	var now = new Date();
	
	if (endDate.getTime() - startDate.getTime() < 0 || startDate.getTime() - now.getTime() < 0) {
		$('#amount_of_hours').html("-");
		$('#total_amount').html("-");
		$('#hourly_price').removeClass("emergency_price");
		$('#emergency_price_info').hide();
		return;
	}
	
	var difference = (((startDate.getTime() - now.getTime())/ (60 * 60 * 1000)).toFixed(2));
	if (difference < 20) {
		/** Emergency case **/
		var current_price = baseprice;
		current_price += current_price*(1/(difference*0.1));
		/** cast to double before applying tofixed(). Loving the Javascript. **/
		$('#hourly_price').html((1.0*current_price).toFixed(2));
		$('#hourly_price').addClass("emergency_price");
/*		$('#emergency_price_info').show(); */
	} else {
		$('#hourly_price').removeClass("emergency_price");
/*		$('#emergency_price_info').hide(); */
	}
	
	
	difference = endDate.getTime() - startDate.getTime();
	var hours = (difference / (60 * 60 * 1000)).toFixed(2);
	$('#amount_of_hours').html(hours);
	$('#total_amount').html((hours * $('#hourly_price').html()).toFixed(2));
	
}

