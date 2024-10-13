package model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    protected static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    protected int room;
    protected Date checkIn;
    protected Date checkOut;


    public Reservation(){

    }
    public Reservation(int room, Date checkIn, Date checkOut) {
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (!checkIn.after(now) || !checkOut.after(now)) {
            throw new IllegalArgumentException("As datas de reserva para atualizações devem ser datas futuras");
        }
        if (!checkOut.after(checkIn)) {
            throw new IllegalArgumentException("A data de checkout para atualização deve ser posterior à data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

        public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        }


    @Override
    public String toString() {
        return "Quarto: " + room + ", Check-in: " + sdf.format(checkIn) + ", Check-out: " + sdf.format(checkOut) + ", Duração: " + duration() + " dias";
    }

    }
