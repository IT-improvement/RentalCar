$(function() {
	$('input[name="start"]').daterangepicker({
		singleDatePicker: true,
		alwaysOpen: true,
		timePicker: true,
		minDate: moment().format('YYYYMMDD'),
		locale: {
			format: 'YYYY/MM/DD hh:mm A'
		}
	});
	$('input[name="end"]').daterangepicker({
		singleDatePicker: true,
		alwaysOpen: true,
		timePicker: true,
		minDate: moment().add(1, 'days').format('YYYYMMDD'),
		locale: {
			format: 'YYYY/MM/DD hh:mm A'
		}
	});
});