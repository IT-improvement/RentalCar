$(document).ready(function() {
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

    $('form').submit(function(e) {
        e.preventDefault();
        var start = $('input[name="start"]').val();
        var end = $('input[name="end"]').val();
        console.log(start);
        console.log(end);
        var errorDate = $('.error-message')[0];
        if (start > end) {
            errorDate.innerHTML = "날짜를 다시 선택하세요.";
        } else {
			e.target.submit();
        }
    });
});

