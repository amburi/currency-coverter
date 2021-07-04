package com.example.currency.model;

public class CurrencyConversionRes {
    public Motd motd;
    public boolean success;
    public Query query;
    public Info info;
    public boolean historical;
    public String date;
    public double result;

    public Motd getMotd() {
        return motd;
    }

    public void setMotd(Motd motd) {
        this.motd = motd;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public boolean isHistorical() {
        return historical;
    }

    public void setHistorical(boolean historical) {
        this.historical = historical;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CurrencyConversionRes{" +
                "motd=" + motd +
                ", success=" + success +
                ", query=" + query +
                ", info=" + info +
                ", historical=" + historical +
                ", date='" + date + '\'' +
                ", result=" + result +
                '}';
    }

    public class Query {
        public String from;
        public String to;
        public int amount;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Query{" +
                    "from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }

    public class Info {
        public double rate;

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "rate=" + rate +
                    '}';
        }
    }
}


